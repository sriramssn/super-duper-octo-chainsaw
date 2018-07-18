/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandstrings.problem3_urlify;

/**
 *
 * @author sriram
 */
public class URLifier {
    
    public void URLify(char[] input, int trueLength) {
        int countOfSpaces = 0;
        for(int i=0;i<trueLength;i++) {
            if(input[i] == ' ') {
                countOfSpaces++;
            }
        }
        
        int index = trueLength + countOfSpaces*2;
        
        for(int i=trueLength-1; i >= 0; i--) {
            if(input[i] == ' ') {
                input[index-1] = '0';
                input[index-2] = '2';
                input[index-3] = '%';
                index = index - 3;
            } else {
                input[index-1] = input[i];
                index--;
            }
        }
        
        return;
        
    }
    
}
