/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class LineRequest implements Command{

    private States s;
    private String line;

    
    public LineRequest(States s, String line){
        this.s = s;
        this.line = line;
     
    }
    
    @Override
    public void execute() {
        s.addLine(this.line);
    }

    @Override
    public void undo() {
        
    }
    
}
