
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import sep.tinee.net.message.Bye;
import sep.tinee.net.message.Push;
import sep.tinee.net.message.ReadReply;
import sep.tinee.net.message.ReadRequest;

/**
 * This class is an initial work-in-progress prototype for a command line
 * Tinee client. It has been hastily hacked together, as often the case
 * in early exploratory coding, and is incomplete and buggy. However, it
 * does compile and run, and <i>some</i> basic functionality, such as pushing
 * and reading tines to and from an instance of
 * {@link sep.tinee.server.Server}, is working. Try it out!
 * <p>
 * The arguments required to run a client correspond to the
 * {@link #set(String, String, int)} method: a user name, and the host name
 * and port number of a Tinee server.
 * <p>
 * You can compile and run this client using <b>NetBeans</b>; e.g., right-click
 * this file in the NetBeans editor and select "Run File".  Note, to provide
 * the above arguments, you should set up a <b>run configuration</b> for this
 * class: {@literal ->} "Set Project Configuration" {@literal ->} "Customize..."
 * {@literal ->} "New...".
 * <p>
 * Assuming compilation using NetBeans (etc.), you can also run {@code Client}
 * from the command line; e.g., on Windows, run:
 * <ul>
 * <li style="list-style-type: none;">
 * {@code C:\...\tinee>  java -cp build\classes Client userid localhost 8888}
 * </ul>
 * <p>
 * You will be significantly reworking and extending this client: your aim is
 * to meet the specification, and you have mostly free rein to do so.
 * (That is as opposed to the base framework, which you are <b>not</b> permitted
 * to modify, i.e., the packages {@link sep.tinee.server},
 * {@link sep.tinee.server}, {@link sep.tinee.server} and]
 * {@link sep.tinee.server}.) The constraints on your client are:
 * <ul>
 * <li>
 * You must retain a class named {@code Client}) as the frontend class for
 * running your client, i.e., via its static {@linkplain #main(String[]) main}
 * method.
 * <li>
 * The {@linkplain Client#main(String[]) main} method must accept the <i>same
 * arguments</i> as currently, i.e., user name, host name and port number.
 * <li>
 * Your client must continue to accept user commands on the <i>standard input
 * stream</i> ({@code System.in}), and output on the <i>standard output
 * stream</i> ({@code System.out}).
 * <li>
 * Any other conditions specified by the assignment tasks.
 * </ul>
 * <p>
 * <i>Tip:</i> generate and read the <b>JavaDoc</b> API documentation for the
 * provided base framework classes (if you're not already reading this there!).
 * After importing the code project into NetBeans, right-click the project in
 * the "Projects" window and select "Generate Javadoc".
 * By default, the output is written to the {@code dist/javadoc} directory.
 * You can directly read the comments in the code for the same information, but
 * the generated JavaDoc is formatted more nicely as HTML with click-able links.  
 *
 * @see CLFormatter
 */
public class Client {

  private String user;
  private String host;
  private int port;

  private boolean printSplash = true;

  public Client(String user, String host, int port) {
    this.user = user;
    this.host = host;
    this.port = port;
  }

  public static void main(String[] args) throws IOException {
    String user = args[0];
    String host = args[1];
    int port = Integer.parseInt(args[2]);
    Client client = new Client(user, host, port);
    client.run();
  }


  // Run the client
  @SuppressFBWarnings(
      value = "DM_DEFAULT_ENCODING",
      justification = "When reading console, ignore 'default encoding' warning")
  void run() throws IOException {
    
    BufferedReader reader = null;
    CLFormatter helper = null;
    LanguageManager lang = null;

    
    try {
        
      reader = new BufferedReader(new InputStreamReader(System.in));
      lang = new LanguageManager();
      
      //choice =  myIn.nextInt();
      if (this.user.isEmpty() || this.host.isEmpty()) {
        System.err.println(lang.getUserNotSetMessage());
        System.exit(1);
      }
      helper = new CLFormatter(this.host, this.port);

      if (this.printSplash == true)
      {
        System.out.print(lang.getFormatSplash(this.user));
      }
      loop(helper, reader);
      
    } catch (IOException ex) {
        
        System.err.println(lang.getIOExceptionMessage() + ex.getMessage());
        ex.printStackTrace();
        
    } catch (ClassNotFoundException ex){
        
        System.err.println(lang.getClassNotFoundExceptionMessage() + ex.getMessage());
        ex.printStackTrace();
        
        
    } finally {
        
      reader.close();
      
      if (helper.chan.isOpen()) {
        // If the channel is open, send Bye and close
        helper.chan.send(new Bye());
        
        helper.chan.close();
        
      }
    }
  }

// Main loop: print user options, read user input and process
    void loop(CLFormatter helper, BufferedReader reader) throws IOException,ClassNotFoundException { // controller

        LanguageManager lang = new LanguageManager();

        // The app is in one of two states: "Main" or "Drafting"
        
        String currentState = "Main";  // Initial state
        boolean done = false;//
        String draftTag = null;
        List<String> draftLines = new LinkedList<>();
       
        SwitchStates s = new SwitchStates(currentState, done, draftTag, draftLines);
          
 
        
        // Holds the current draft data when in the "Drafting" state

        // The loop
       
        
        while (!s.getDone()) {

            // Print user options
            if ("Main".equals(s.getState())) {

                System.out.print(lang.getFormatMainMenuPrompt());

            } else {  // state = "Drafting"

                System.out.print(lang.getFormatDraftingMenuPrompt(s.getDraftTag(), s.getDraftLines()));
            }

            // Read a line of user input
            String raw = reader.readLine();

            if (raw == null) {

                throw new IOException(lang.getInputStreamClosedMessage());

            }
            // Trim leading/trailing white space, and split words according to spaces
            List<String> split = Arrays.stream(raw.trim().split("\\s+", 2)).map(x -> x.trim()).collect(Collectors.toList());

            String cmd = split.remove(0);  // First word is the command keyword

            String[] rawArgs = split.toArray(new String[split.size()]);
            // Remainder, if any, are arguments

            // Process user input
            if ("exit".startsWith(cmd)) {
                
                ExitRequest exit = new ExitRequest(s); //request
                

                // exit command applies in either state
                Command(exit); //requestor

            } // "Main" state commands
            else if ("Main".equals(s.getState())) {


                if ("manage".startsWith(cmd)) {

                    // Switch to "Drafting" state and start a new "draft"
                    ManageRequest manage = new ManageRequest(s, rawArgs[0]);  // request
                    Command(manage);//requestor


                } else if ("read".startsWith(cmd)) {


                    // Read tines on server
                    //helper.chan.send(new ReadRequest(rawArgs[0]));
                    
                    ReadTagRequest read = new ReadTagRequest(s, rawArgs[0]); // request
                    
                    Command(read); // requestor
                    
                    ReadReply rep = (ReadReply) helper.chan.receive();
                    
                    
                    System.out.print(lang.getFormatReadMessage(rawArgs[0], rep.users, rep.lines));


                } else {

                    System.out.println(lang.getCouldNotParseCommandMessage());

                }
            } // "Drafting" state commands
            else if ("Drafting".equals(s.getState())) {

                if ("line".startsWith(cmd)) {
                    
                    
                    // Add a tine message line
                    String tagLine = Arrays.stream(rawArgs).collect(Collectors.joining());
                    
                    LineRequest line = new LineRequest(s, tagLine); //request
                    
                    
                    Command(line); //requestor


                } else if ("push".startsWith(cmd)) {

                    PushRequest push = new PushRequest(s,user);  // request 
                    

                    // Send drafted tines to the server, and go back to "Main" state

                    Command(push); //requestor


                } else {

                    System.out.println(lang.getCouldNotParseCommandMessage());

                }
            } else {

                System.out.println(lang.getCouldNotParseCommandMessage());


            }
        }
    }
    
//    private String Manage(SwitchStates s){
//        return s;
//        
//    }
    
    private void Command(Command cmd){ //executor or Invoker

        cmd.execute();
    }
}
