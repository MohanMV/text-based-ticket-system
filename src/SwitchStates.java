/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class SwitchStates implements States {
    
    private String state;
    private boolean done;
    
    public SwitchStates(String state, boolean done){
        this.state = state;
        this.done = done;   
    }
    
    public String getState(){
        return this.state;
    }
    
    public boolean getDone(){
        return this.done;
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
    public void exit() {
        this.done = true;
    }
}
