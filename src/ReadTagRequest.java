
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class ReadTagRequest implements Command {
    private States s;
    private String rawArgs;

    
    public ReadTagRequest(States s, String rawArgs){
        this.s = s;
        this.rawArgs = rawArgs;
     
    }
    
    @Override
    public void execute() {
        try {
            s.readTagRequest(this.rawArgs);
        } catch (IOException ex) {
            Logger.getLogger(ReadTagRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void undo() {
        
    }
}
