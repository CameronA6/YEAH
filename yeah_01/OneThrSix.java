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
public class OneThrSix {
    
    public int[] MultScores(int[] toMult){
        
        int[] multScores = new int[6];
        int[] thisMult = toMult;
        //System.out.println("tM: " + Arrays.toString(thisMult));

        for(int i = 0; i < 6; i++){
            int x = i+ 1;
            //System.out.println(x);
             multScores[i] = x * thisMult[i];
        }
    
    //System.out.println(Arrays.toString(multScores));
    return multScores;
    }
}
