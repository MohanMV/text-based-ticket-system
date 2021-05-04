package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohan;
 */
public class ClientTest {
    
    Client clientA;
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        clientA = new Client("username","localhost", 8888);
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Check if runtime error is thrown when push command is carried out initially without adding any lines to draft
     */
    @Test(expected = RuntimeException.class)
    public void testPushThrowsExceptionIfNoLineIsAdded() throws Exception {
        
        String[] args = {"username", "localhost", "8888"};
        String input = "manage foo\npush\nexit\n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF8"));
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes("UTF8"));
        System.setIn(in);
        Client.main(args);
    }
    
    /**
     * Check if an error is thrown when push command is used without using line command on tags that already has tines
     */
    @Test(expected = RuntimeException.class)
    public void testPushThrowsExceptionIfNoSecondLineIsAdded() throws Exception {
        
        String[] args = {"username", "localhost", "8888"};
        String input = "manage tag1\nline hello\npush\nmanage tag1\npush\nexit\n";
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF8"));
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes("UTF8"));
        System.setIn(in);
        Client.main(args);
    }
    
     /**
     * Check if program accepts spacing when a new line of text is added 
     * True if spacing is accepted
     * False if spacing is ignored
     */
    @Test
    public void testSpacingWhenNewLineIsAdded() throws Exception {
        
        String[] args = {"username", "localhost", "8888"};
        String input = "manage tag2\nline read one line\npush\nread tag2\nexit";
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF8"));
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes("UTF8"));
        System.setIn(in); 
        Client.main(args);
 
        String output = out.toString("UTF8");
        String expectedOutput = "read one line";
        boolean actual = output.contains(expectedOutput);
        assertTrue("Output does not contain String 'read one line'",actual);
    }
    
     /**
     * Check if program accepts spacing when a new line of text is added 
     * True if spacing is accepted
     * False if spacing is ignored
     */
    @Test
    public void testWhiteSpaceWhenNewLineIsAdded() throws Exception {
        
        String[] args = {"username", "localhost", "8888"};
        String input = "manage tag2\nline read one       line\npush\nread tag2\nexit";
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF8"));
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes("UTF8"));
        System.setIn(in); 
        Client.main(args);
 
        String output = out.toString("UTF8");
        String expectedOutput = "read one       line";
        boolean actual = output.contains(expectedOutput);
        assertTrue("Output does not contain String 'read one         line'",actual);
    }
}
