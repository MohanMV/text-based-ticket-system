
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class LanguageManager {
    
    
    private static final String RESOURCE_PATH = "resources/MessageBundle";
    private ResourceBundle strings = null;

    /**
     * Loads the locale setting based on the language chosen by the user
     * @param language
     */
    public LanguageManager(String language){
        
        if(language.equals("1")){
            strings = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("en", "GB"));
        } else if(language.equals("2")){
            strings = ResourceBundle.getBundle(RESOURCE_PATH, new Locale("fr", "FR"));
        }
    }
    
    /**
     * Retrieve  
     * @return 
     */
    public String getFormatSplash(String user){
        return println(strings.getString("format_splash"),user);
    }
    
    public String getFormatMainMenuPrompt(){
        return strings.getString("format_main_menu_prompt");
    }
    
    public String getFormatDraftingMenuPrompt(String tag, List<String> lines){
        return println(strings.getString("format_drafting_menu_prompt"),formatDrafting(tag, lines));
    }
    
    public String getUserNotSetMessage(){
        return strings.getString("user_not_set");
    }
    
    public String getInputStreamClosedMessage(){
        return strings.getString("input_stream_closed");
    }   
    
    public String getCouldNotParseCommandMessage(){
        return strings.getString("could not parse command/args.");
    }    
    
    public String getIOExceptionMessage(){
        return strings.getString("io_exception");
    }   
    public String getClassNotFoundExceptionMessage(){
        return strings.getString("class_not_found_exception");
    }
    
    private  static String formatDrafting(String tag, List<String> lines) {
        StringBuilder b = new StringBuilder("#");
        b.append(tag);
        int i = 1;
        for (String x : lines) {
            b.append("\n");
            b.append(String.format("%12d", i++));
            b.append("  ");
            b.append(x);
        }
        return b.toString();
    }
    
    private String println(String message, Object...params){
        return (MessageFormat.format(message,params));
    }   
}
