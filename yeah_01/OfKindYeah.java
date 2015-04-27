/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeah_01;

import java.util.Arrays;

/**
 *
 * @author Cameron
 */
public class OfKindYeah {
    private int sum;
    
    public int[] Yeah(int toMult[], int[] toAdd){
        int[] yeahScores = new int[5];
        sum = 0;
        for(int i : toAdd) sum += i;
        yeahScores[4] = sum; //CHANCE
        
        boolean twoTrue = false;
        boolean threeTrue = false;        
        
        for (int i = 0; i < 6; i++){
            switch (toMult[i]){
                case 2: twoTrue = true;
                    break;
                case 3: yeahScores[0] = sum;
                    threeTrue = true;
                    break;
                case 4: yeahScores[1] = sum;
                    break;
                case 5: yeahScores[3] = 50;
                    break;
                default:
                    break;
            }
        } 
        if(twoTrue && threeTrue) yeahScores[2] = 25;

    return yeahScores;
    }
}
    

