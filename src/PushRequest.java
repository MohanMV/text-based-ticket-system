/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class PushRequest implements Command {
    
    private States s;
    
    public PushRequest(States s){
        this.s = s;
    }
    
    
    @Override
    public String execute() {
        return s.stateMain();
    }
    
}
