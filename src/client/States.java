package client;


import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Methods implemented in Commands
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public interface States {
    
    /**
     *Set state to main
     */
    public void stateMain();
    
    /**
     *Add line to drafted lines
     * @param line line that is drafted
     */
    public void addLine(String line);
    
    /**
     *Clear draft lines list
     */
    public void clearDraftLines();
    
    /**
     *Set draftTag to null
     */
    public void setDraftTagNull();
    
    /**
     *Tag to be drafted
     * @param rawArgs tag
     */
    public void addDraftTag(String rawArgs);
    
    /**
     *Push lines to server
     * @param user name of user who drafted lines
     * @throws IOException
     */
    public void pushLines(String user)throws IOException;
    
    /**
     *Read lines on tag
     * @param user tag
     * @throws IOException
     */
    public void readTagRequest(String user) throws IOException;
       
    /**
     *Set state to drafting
     */
    public void stateDrafting();
    
    /**
     * Undo line
     * @param line line to be removed
     */
    public void removeLine(String line);
    
    /**
     *exit states
     */
    public void exit();

}
