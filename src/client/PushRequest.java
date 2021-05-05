package client;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Push Command
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class PushRequest implements Command {
    
    private States s;
    private String user;
    
    /**
     * Constructor for PushRequest
     * @param s receiver
     * @param user user name
     */
    public PushRequest(States s, String user){
        this.s = s;        
        this.user = user;
    }
    
    /**
     * Push lines to server
     * clear buffer variable
     */
    @Override
    public void execute() {
        
        s.stateMain();       
        try {
            s.pushLines(user);
        } catch (IOException ex) {
            Logger.getLogger(PushRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.setDraftTagNull();
        s.clearDraftLines();
    }
    
    /**
     *
     */
    @Override
    public void undo(){
        s.stateDrafting();
    }
    
}
