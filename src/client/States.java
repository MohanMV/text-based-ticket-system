package client;


import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public interface States {
    
    public void stateMain();
    
    public void addLine(String line);
    
    public void clearDraftLines();
    
    public void setDraftTagNull();
    
    public void addDraftTag(String rawArgs);
    
    public void pushLines(String user)throws IOException;
    
    public void readTagRequest(String user) throws IOException;
       
    public void stateDrafting();
    
    public void exit();

}
