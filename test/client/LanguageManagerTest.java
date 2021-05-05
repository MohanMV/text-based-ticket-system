/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
public class LanguageManagerTest {
    
    public LanguageManagerTest() {
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
     * Test of getFormatSplash method, of class LanguageManager.
     */
    @Test
    public void testGetFormatSplash() {
        System.out.println("getFormatSplash");
        String user = "";
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getFormatSplash(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormatMainMenuPrompt method, of class LanguageManager.
     */
    @Test
    public void testGetFormatMainMenuPrompt() {
        System.out.println("getFormatMainMenuPrompt");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getFormatMainMenuPrompt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormatDraftingMenuPrompt method, of class LanguageManager.
     */
    @Test
    public void testGetFormatDraftingMenuPrompt() {
        System.out.println("getFormatDraftingMenuPrompt");
        String tag = "";
        List<String> lines = null;
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getFormatDraftingMenuPrompt(tag, lines);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserNotSetMessage method, of class LanguageManager.
     */
    @Test
    public void testGetUserNotSetMessage() {
        System.out.println("getUserNotSetMessage");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getUserNotSetMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputStreamClosedMessage method, of class LanguageManager.
     */
    @Test
    public void testGetInputStreamClosedMessage() {
        System.out.println("getInputStreamClosedMessage");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getInputStreamClosedMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCouldNotParseCommandMessage method, of class LanguageManager.
     */
    @Test
    public void testGetCouldNotParseCommandMessage() {
        System.out.println("getCouldNotParseCommandMessage");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getCouldNotParseCommandMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIOExceptionMessage method, of class LanguageManager.
     */
    @Test
    public void testGetIOExceptionMessage() {
        System.out.println("getIOExceptionMessage");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getIOExceptionMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassNotFoundExceptionMessage method, of class LanguageManager.
     */
    @Test
    public void testGetClassNotFoundExceptionMessage() {
        System.out.println("getClassNotFoundExceptionMessage");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getClassNotFoundExceptionMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormatReadMessage method, of class LanguageManager.
     */
    @Test
    public void testGetFormatReadMessage() {
        System.out.println("getFormatReadMessage");
        String tag = "";
        List<String> users = null;
        List<String> read = null;
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getFormatReadMessage(tag, users, read);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExitMessage method, of class LanguageManager.
     */
    @Test
    public void testGetExitMessage() {
        System.out.println("getExitMessage");
        LanguageManager instance = null;
        String expResult = "";
        String result = instance.getExitMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
