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
public class SwitchStatesTest {
    
    public SwitchStatesTest() {
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
     * Test of getState method, of class SwitchStates.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        SwitchStates instance = new SwitchStates();
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDone method, of class SwitchStates.
     */
    @Test
    public void testGetDone() {
        System.out.println("getDone");
        SwitchStates instance = new SwitchStates();
        boolean expResult = false;
        boolean result = instance.getDone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDraftTag method, of class SwitchStates.
     */
    @Test
    public void testGetDraftTag() {
        System.out.println("getDraftTag");
        SwitchStates instance = new SwitchStates();
        String expResult = "";
        String result = instance.getDraftTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDraftLines method, of class SwitchStates.
     */
    @Test
    public void testGetDraftLines() {
        System.out.println("getDraftLines");
        SwitchStates instance = new SwitchStates();
        List<String> expResult = null;
        List<String> result = instance.getDraftLines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stateMain method, of class SwitchStates.
     */
    @Test
    public void testStateMain() {
        System.out.println("stateMain");
        SwitchStates instance = new SwitchStates();
        instance.stateMain();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stateDrafting method, of class SwitchStates.
     */
    @Test
    public void testStateDrafting() {
        System.out.println("stateDrafting");
        SwitchStates instance = new SwitchStates();
        instance.stateDrafting();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDraftTagNull method, of class SwitchStates.
     */
    @Test
    public void testSetDraftTagNull() {
        System.out.println("setDraftTagNull");
        SwitchStates instance = new SwitchStates();
        instance.setDraftTagNull();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearDraftLines method, of class SwitchStates.
     */
    @Test
    public void testClearDraftLines() {
        System.out.println("clearDraftLines");
        SwitchStates instance = new SwitchStates();
        instance.clearDraftLines();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exit method, of class SwitchStates.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        SwitchStates instance = new SwitchStates();
        instance.exit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLine method, of class SwitchStates.
     */
    @Test
    public void testAddLine() {
        System.out.println("addLine");
        String line = "";
        SwitchStates instance = new SwitchStates();
        instance.addLine(line);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readTagRequest method, of class SwitchStates.
     */
    @Test
    public void testReadTagRequest() throws Exception {
        System.out.println("readTagRequest");
        String rawArgs = "";
        SwitchStates instance = new SwitchStates();
        instance.readTagRequest(rawArgs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushLines method, of class SwitchStates.
     */
    @Test
    public void testPushLines() throws Exception {
        System.out.println("pushLines");
        String user = "";
        SwitchStates instance = new SwitchStates();
        instance.pushLines(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDraftTag method, of class SwitchStates.
     */
    @Test
    public void testAddDraftTag() {
        System.out.println("addDraftTag");
        String rawArgs = "";
        SwitchStates instance = new SwitchStates();
        instance.addDraftTag(rawArgs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
