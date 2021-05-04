/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mohankumaar MV student-id = 17048038;
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({client.LineRequestTest.class, client.ExitRequestTest.class, client.StatesTest.class, client.ClientTest.class, client.PushRequestTest.class, client.ManageRequestTest.class, client.CLFormatterTest.class, client.ReadTagRequestTest.class, client.CommandTest.class, client.LanguageManagerTest.class, client.SwitchStatesTest.class})
public class ClientSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
