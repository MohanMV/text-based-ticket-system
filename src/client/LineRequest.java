package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Carries out the Line Command
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class LineRequest implements Command{

    private States s;
    private String line;

    /** Constructor for LineRequest
     *
     * @param s receiver
     * @param line line to be added/undo
     */
    public LineRequest(States s, String line){
        this.s = s;
        this.line = line;
     
    }
    
    /** draft line
     *
     */
    @Override
    public void execute() {
        s.addLine(this.line);
    }

    /** undo line
     *
     */
    @Override
    public void undo() {
        s.removeLine(this.line);
    }
    
}
