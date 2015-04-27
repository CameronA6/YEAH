
package yeah_01;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ScoreSheet {

    int[] scoreSheet = new int[14];
    
    public int[] Scores(int selectScore, int[]currentScore){
        
        int[] nowScore =  currentScore;
        scoreSheet[selectScore] = nowScore[selectScore];
        scoreSheet[13] = 0;
        for(int i = 0; i < 13; i++) scoreSheet[13] += scoreSheet[i]; //TOTAL
    
    return scoreSheet;    
    }    
    
    
    public void printScore(){
        System.out.print("\n--------------------------------------------");

        System.out.println("\none - six: ");
        for(int i = 0; i <= 5; i++){
        System.out.print(Array.get(scoreSheet, i));
        System.out.print(", ");
        }
        
        System.out.print("\n");
        
        System.out.println("\nTHREE of a kind: " + Array.get(scoreSheet, 6));
        System.out.println("FOUR of a kind:" + Array.get(scoreSheet, 7));
        System.out.println("FUll_HOUSE:" + Array.get(scoreSheet, 8));
        System.out.println("\nSM_Straight:" + Array.get(scoreSheet, 11));
        System.out.println("LG_Straight is:" + Array.get(scoreSheet, 12));
        System.out.println("\nYEAH:" + Array.get(scoreSheet, 9));        
        System.out.println("Chance:" + Array.get(scoreSheet, 10));
        
        System.out.println("TOTAL:" + Array.get(scoreSheet, 13));

    }
}    