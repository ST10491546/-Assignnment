/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignnment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginDetailsTest {
    
    public LoginDetailsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tea    /**
     * Test of getRegisteredUsername method, of class LoginDetails.
     */
    @Test
    public void testGetRegisteredUsername() {
        System.out.println("getRegisteredUsername");
        LoginDetails instance = new LoginDetails();
        String expResult = "";
        String result = instance.getRegisteredUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisteredUsername method, of class LoginDetails.
     */
    @Test
    public void testSetRegisteredUsername() {
        System.out.println("setRegisteredUsername");
        String registeredUsername = "";
        LoginDetails instance = new LoginDetails();
        instance.setRegisteredUsername(registeredUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisteredPassword method, of class LoginDetails.
     */
    @Test
    public void testGetRegisteredPassword() {
        System.out.println("getRegisteredPassword");
        LoginDetails instance = new LoginDetails();
        String expResult = "";
        String result = instance.getRegisteredPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisteredPassword method, of class LoginDetails.
     */
    @Test
    public void testSetRegisteredPassword() {
        System.out.println("setRegisteredPassword");
        String registeredPassword = "";
        LoginDetails instance = new LoginDetails();
        instance.setRegisteredPassword(registeredPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisteredPhone method, of class LoginDetails.
     */
    @Test
    public void testGetRegisteredPhone() {
        System.out.println("getRegisteredPhone");
        LoginDetails instance = new LoginDetails();
        String expResult = "";
        String result = instance.getRegisteredPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisteredPhone method, of class LoginDetails.
     */
    @Test
    public void testSetRegisteredPhone() {
        System.out.println("setRegisteredPhone");
        String registeredPhone = "";
        LoginDetails instance = new LoginDetails();
        instance.setRegisteredPhone(registeredPhone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkName method, of class LoginDetails.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String username = "";
        LoginDetails instance = new LoginDetails();
        boolean expResult = false;
        boolean result = instance.checkName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class LoginDetails.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        LoginDetails instance = new LoginDetails();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class LoginDetails.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phone = "";
        LoginDetails instance = new LoginDetails();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LoginDetails.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        LoginDetails instance = new LoginDetails();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LoginDetails.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        LoginDetails instance = new LoginDetails();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LoginDetails.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = false;
        String firstName = "";
        String lastName = "";
        LoginDetails instance = new LoginDetails();
        String expResult = "";
        String result = instance.returnLoginStatus(loginStatus, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

rDown() {
    }
    
}
