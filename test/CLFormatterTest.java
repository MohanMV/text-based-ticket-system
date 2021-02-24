/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
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
public class CLFormatterTest {
    
    public CLFormatterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of formatSplash method, of class CLFormatter.
     */
    @Test
    public void testFormatSplash() {
        System.out.println("formatSplash");
        String user = "";
        String expResult = "";
        String result = CLFormatter.formatSplash(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatMainMenuPrompt method, of class CLFormatter.
     */
    @Test
    public void testFormatMainMenuPrompt() {
        System.out.println("formatMainMenuPrompt");
        String expResult = "";
        String result = CLFormatter.formatMainMenuPrompt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatDraftingMenuPrompt method, of class CLFormatter.
     */
    @Test
    public void testFormatDraftingMenuPrompt() {
        System.out.println("formatDraftingMenuPrompt");
        String tag = "";
        List<String> lines = null;
        String expResult = "";
        String result = CLFormatter.formatDraftingMenuPrompt(tag, lines);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatDrafting method, of class CLFormatter.
     */
    @Test
    public void testFormatDrafting() {
        System.out.println("formatDrafting");
        String tag = "";
        List<String> lines = null;
        String expResult = "";
        String result = CLFormatter.formatDrafting(tag, lines);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatRead method, of class CLFormatter.
     */
    @Test
    public void testFormatRead() {
        System.out.println("formatRead");
        String tag = "";
        List<String> users = null;
        List<String> read = null;
        String expResult = "";
        String result = CLFormatter.formatRead(tag, users, read);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
