/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings.problem2_permutation;

import java.util.Arrays;

/**
 *
 * @author sriram
 */
public class StringPermutationChecker {
    
    public boolean isPermutation_1(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        return sort(str1).equals(sort(str2));
    }
    
    private static String sort(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    public boolean isPermutation_2(String str1, String str2) {
        
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128];
        
        for(char c : str1.toCharArray()) {
            letters[c]++;
        }
        
        for(char c : str2.toCharArray()) {
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }
        return true;
        
    }
    
}
