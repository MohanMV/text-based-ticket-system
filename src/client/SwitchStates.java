
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import sep.tinee.net.message.Push;
import sep.tinee.net.message.ReadRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class SwitchStates implements States { // Receiver
    
    private String state;
    private boolean done;
    private String draftTag;
    private List<String> draftLines = new LinkedList<>();
 //   private String[] rawArgs;
    
    
    public SwitchStates(String state, boolean done, String draftTag, List<String> draftLines){
        
        this.state = state;
        this.done = done;   
        this.draftTag = draftTag;
        this.draftLines = draftLines;
//        this.rawArgs = rawArgs;
    }
    
    public String getState(){
        return this.state;
    }
    
    public boolean getDone(){
        return this.done;
    }
    
//    public void setArgs(String[] args){
//        this.rawArgs = args;
//    }
    
    public String getDraftTag(){
        return this.draftTag;
    }
    
    public List<String> getDraftLines(){
        return this.draftLines;
    }
    
    @Override
    public void stateMain(){
        this.state = "Main";
    }
    
    @Override
    public void stateDrafting(){
        this.state = "Drafting";
    }
    
    @Override
    public void setDraftTagNull(){
        this.draftTag = null;
    }
    
    @Override
    public void clearDraftLines(){
        this.draftLines.clear();
    }

    @Override
    public void exit() {
        this.done = true;
    }

    @Override
    public void addLine(String line) {
        this.draftLines.add(line);
    }

    @Override
    public void readTagRequest(String rawArgs) throws IOException {
        CLFormatter.chan.send(new ReadRequest(rawArgs));
    }
    
    @Override
    public void pushLines(String user) throws IOException{
        CLFormatter.chan.send(new Push(user, draftTag, draftLines));
    }

    @Override
    public void addDraftTag(String rawArgs) {
        this.draftTag = rawArgs;
    }
}
