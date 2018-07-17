/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings.problem1_uniquecharacters;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sriram
 */
public class UniqueCharacters {
    
    /**
     * 
     * @param input - Input String
     * @return true if the string contains all unique characters, false otherwise
     * @throws IllegalArgumentException if null string is passed as input
     * O(n) time, O(n) space
     */
    public boolean isUniqueCharacters_1(String input) {
        if(input == null) {
            throw new IllegalArgumentException("Null input string");
        }
        Map<Character, Boolean> charactersMap = new HashMap<>();
        for(char c : input.toCharArray()) {
            if(Boolean.TRUE.equals(charactersMap.get(c))) {
                return false;
            }
            charactersMap.put(c, true);
        }
        return true;
    }
    
    /**
     * 
     * @param input - Input String
     * @return - true if the string contains all unique characters, false otherwise
     * @throws IllegalArgumentException if null input string is passed.
     * O(n^2) time, O(1) space
     */
    public boolean isUniqueCharacters_2(String input) {
        char[] charArray = input.toCharArray();
        for(int i=0;i<charArray.length;i++) {
            for(int j = i+1; j<charArray.length;j++) {
                if(charArray[i] == charArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
