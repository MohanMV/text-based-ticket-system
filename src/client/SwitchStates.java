package client;


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
 *Receiver class
 * @author Mohankumaar MV student-id = 17048038;
 */
public class SwitchStates implements States { // Receiver
    
    private String state;
    private boolean done;
    private String draftTag;
    private List<String> draftLines;
 //   private String[] rawArgs;
    
    /**Constructor for Receiver 
     *Initialises the field 
     */
    public SwitchStates(){
        
        this.state = "Main";
        this.done = false;   
        this.draftTag = null;
        this.draftLines = new LinkedList<>();
//        this.rawArgs = rawArgs;
    }
    
    /**
     *  Returns the current state
     * @return current state
     */
    public String getState(){
        return this.state;
    }
    
    /**
     * Returns done value
     * @return true or false
     */
    public boolean getDone(){
        return this.done;
    }
    
    /**
     * Return drafted line
     * @return drafted line
     */
    public String getDraftTag(){
        return this.draftTag;
    }
    
    /**
     * Return list of drafted lines
     * @return list of drafted lines
     */
    public List<String> getDraftLines(){
        return this.draftLines;
    }
    
    /**Set state to main
     *
     */
    @Override
    public void stateMain(){
        this.state = "Main";
    }
    
    /**
     * Set state to drafting
     *
     */
    @Override
    public void stateDrafting(){
        this.state = "Drafting";
    }
    
    /**
     *  Set draftTag to null
     */
    @Override
    public void setDraftTagNull(){
        this.draftTag = null;
    }
    
    /**
     * Clear draft lines list
     */
    @Override
    public void clearDraftLines(){
        this.draftLines.clear();
    }

    /**
     * exit states
     */
    @Override
    public void exit() {
        this.done = true;
    }

    /**
     * Add line to drafted lines
     * @param line line that is drafted
     */
    @Override
    public void addLine(String line) {
        this.draftLines.add(line);
    }

    /**
     *  Read lines on tag
     * @param rawArgs tag
     * @throws IOException
     */
    @Override
    public void readTagRequest(String rawArgs) throws IOException {
        CLFormatter.chan.send(new ReadRequest(rawArgs));
    }
    
    /**
     * Push lines to server
     * @param user name of user who drafted lines
     * @throws IOException
     */
    @Override
    public void pushLines(String user) throws IOException{
        CLFormatter.chan.send(new Push(user, draftTag, draftLines));
    }

    /**
     *  Tag to be drafted
     * @param rawArgs tag
     */
    @Override
    public void addDraftTag(String rawArgs) {
        this.draftTag = rawArgs;
    }
    
    /**
     * Undo line
     * @param line line to be removed
     */
    @Override
    public void removeLine(String line){
        
        this.draftLines.remove(line);
    }
}
