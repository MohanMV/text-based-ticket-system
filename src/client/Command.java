package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Command Interface
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public interface Command {
    
    /**
     * execute command
     */
    public void execute();
    
    /**
     * undo command
     */
    public void undo();
}
