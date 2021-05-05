package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Manage Command
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class ManageRequest implements Command {
    
    private States s; // Receiver
    private String tag;
    
    /**
     *Constructor for ManageRequest
     * @param s receiver
     * @param tag tag to be managed
     */
    public ManageRequest(States s, String tag){
        this.s = s;
        this.tag = tag;
    }
    
    /**
     * Change state to drafting
     * add tag
     */
    @Override
    public void execute() {
       s.stateDrafting();
       s.addDraftTag(this.tag);
    }
    
    /**
     * Change state to main
     */
    @Override
    public void undo(){
        s.stateMain();
    }
}
