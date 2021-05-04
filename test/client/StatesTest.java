/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
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
public class StatesTest {
    
    public StatesTest() {
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
     * Test of stateMain method, of class States.
     */
    @Test
    public void testStateMain() {
        System.out.println("stateMain");
        States instance = new StatesImpl();
        instance.stateMain();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLine method, of class States.
     */
    @Test
    public void testAddLine() {
        System.out.println("addLine");
        String line = "";
        States instance = new StatesImpl();
        instance.addLine(line);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearDraftLines method, of class States.
     */
    @Test
    public void testClearDraftLines() {
        System.out.println("clearDraftLines");
        States instance = new StatesImpl();
        instance.clearDraftLines();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDraftTagNull method, of class States.
     */
    @Test
    public void testSetDraftTagNull() {
        System.out.println("setDraftTagNull");
        States instance = new StatesImpl();
        instance.setDraftTagNull();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDraftTag method, of class States.
     */
    @Test
    public void testAddDraftTag() {
        System.out.println("addDraftTag");
        String rawArgs = "";
        States instance = new StatesImpl();
        instance.addDraftTag(rawArgs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushLines method, of class States.
     */
    @Test
    public void testPushLines() throws Exception {
        System.out.println("pushLines");
        String user = "";
        States instance = new StatesImpl();
        instance.pushLines(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readTagRequest method, of class States.
     */
    @Test
    public void testReadTagRequest() throws Exception {
        System.out.println("readTagRequest");
        String user = "";
        States instance = new StatesImpl();
        instance.readTagRequest(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stateDrafting method, of class States.
     */
    @Test
    public void testStateDrafting() {
        System.out.println("stateDrafting");
        States instance = new StatesImpl();
        instance.stateDrafting();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exit method, of class States.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        States instance = new StatesImpl();
        instance.exit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StatesImpl implements States {

        public void stateMain() {
        }

        public void addLine(String line) {
        }

        public void clearDraftLines() {
        }

        public void setDraftTagNull() {
        }

        public void addDraftTag(String rawArgs) {
        }

        public void pushLines(String user) throws IOException {
        }

        public void readTagRequest(String user) throws IOException {
        }

        public void stateDrafting() {
        }

        public void exit() {
        }
    }
    
}
