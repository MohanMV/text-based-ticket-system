/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class ManageRequest implements Command {
    
    private States s; // Receiver
    private String tag;
    
    public ManageRequest(States s, String tag){
        this.s = s;
        this.tag = tag;
    }
    
    
    @Override
    public void execute() {
       s.stateDrafting();
       s.addDraftTag(this.tag);
    }
    
    @Override
    public void undo(){
        s.stateMain();
    }
}
