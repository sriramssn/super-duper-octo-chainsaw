/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings.problem1_uniquecharacters;

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
public class UniqueCharactersTest {
    
    public UniqueCharactersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test(dataProvider = "inputoutput")
    public void isUniqueCharacters_1(String input, boolean result) {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        assertEquals(uniqueCharacters.isUniqueCharacters_1(input), result);
    }
    
    @Test(dataProvider = "inputoutput")
    public void isUniqueCharacters_2(String input, boolean result) {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        assertEquals(uniqueCharacters.isUniqueCharacters_2(input), result);
    }    
    
    
    
    @DataProvider(name="inputoutput")
    public static Object[][] expectedActualValues() {
        return new Object[][]
        {
            {"abcdefg", true},
            {"abdddef", false},
            {"aabcdki", false},
            {"abcdee", false}
        };
    }
}
