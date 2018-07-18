/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings.problem3_urlify;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author sriram
 */
public class URLifierTest {
    
    public URLifierTest() {
    }
    
    @DataProvider(name = "inputoutput")
    public static Object[][] inputOutputProvider() {
        return new Object[][]
        {
            {"first test  ", 10, "first%20test"}
        };
    }
    
    @Test(dataProvider = "inputoutput")
    public void URLifyTest(String input, int trueLength, String output) {
        char[] inputArray = input.toCharArray();
        char[] outputArray = output.toCharArray();
        URLifier instance = new URLifier();
        instance.URLify(inputArray, trueLength);
        assertEquals(inputArray, outputArray);
    }
    
}
