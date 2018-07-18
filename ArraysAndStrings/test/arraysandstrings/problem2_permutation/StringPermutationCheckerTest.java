/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings.problem2_permutation;

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
public class StringPermutationCheckerTest {
    
    public StringPermutationCheckerTest() {
    }
  
    @DataProvider(name = "inputoutput")
    public static Object[][] inputOutputProvider() {
        return new Object[][]
        {
            {"abc", "cab", true},
            {"abd", "bda", true},
            {"abcd", "abc", false},
            {"aaaaaaaaaaaa", "aaaaaa", false}
        };
    }
    
    @Test (dataProvider = "inputoutput")
    public void isPermutationTest_1(String str1, String str2, boolean expectedValue) {
        StringPermutationChecker instance = new StringPermutationChecker();
        assertEquals(instance.isPermutation_1(str1, str2), expectedValue);
    }
    
    @Test (dataProvider = "inputoutput")
    public void isPermutationTest_2(String str1, String str2, boolean expectedValue) {
        StringPermutationChecker instance = new StringPermutationChecker();
        assertEquals(instance.isPermutation_2(str1, str2), expectedValue);
    }    
    
}
