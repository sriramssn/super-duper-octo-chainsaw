/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4_palindromepermutation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sriram
 */
public class PalindromePermutationChecker {
    
    public boolean isPermutationOfPalindrome_1(String str) {
        Map<Character, Integer> lettersMap = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            Character c = str.charAt(i);
            int count = 0;
            if(lettersMap.get(c) != null) {
                count = lettersMap.get(c);
            }
            lettersMap.put(c, count+1);
        }
    }
    
}
