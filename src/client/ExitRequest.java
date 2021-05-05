package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Exit Command
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class ExitRequest implements Command{

    private States s; // Receiver
    
    /**
     *Constructor for ExitRequest
     * @param s receiver
     */
    public ExitRequest(States s){
        this.s = s;
    }
    
    /**
     * exit
     */
    @Override
    public void execute() {    
        s.exit();
    }
    
    /**
     * 
     */
    @Override
    public void undo(){
        
    }
    
}
