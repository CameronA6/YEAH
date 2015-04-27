
package yeah_01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CurrentScore {
    int[] currentScore = new int[13];
    public int[] ThisScore(int[] toMult, int[] toAdd){
        
        int[] currentMult = toMult;

        int[] currentAdd = toAdd;
        
        OneThrSix topScores = new OneThrSix();
        int[] oneSix = topScores.MultScores(currentMult);
        for(int i = 0; i < 6; i++){
            currentScore[i] = oneSix[i]; //currentScore[0-5]
        }
        
        OfKindYeah multiples = new OfKindYeah();
        int[] multiYeah = multiples.Yeah(currentMult, currentAdd);
        for(int i = 6; i < 11; i++){
            int x = i - 6;
            currentScore[i] = multiYeah[x]; //currentScore[6-10]
        }
        
        
        Straights rScore = new Straights();
        int[] runScore = rScore.StrtScores(currentMult);
        currentScore[11] = runScore[0];
        currentScore[12] = runScore[1];
        
        System.out.println(Arrays.toString(currentScore));

    return currentScore;    
}
    public void scoreNow(){
        System.out.print("\n");

        System.out.println("the score for one - six [0-5]: ");
        for(int i = 0; i <= 5; i++){
        System.out.print(Array.get(currentScore, i));
        System.out.print(", ");
        }
        
        System.out.print("\n");
        
        System.out.println("\nthe score for THREE of a kind is [6]: " + Array.get(currentScore, 6));
        System.out.println("the score for FOUR of a kind is: [7]" + Array.get(currentScore, 7));
        System.out.println("the score for FUll_HOUSE is: [8]" + Array.get(currentScore, 8));
        System.out.println("\nthe score for SM_Straight is: [11]" + Array.get(currentScore, 11));
        System.out.println("the score for LG_Straight is: [12]" + Array.get(currentScore, 12));
        System.out.println("\nYEAH: [9]" + Array.get(currentScore, 9));        
        System.out.println("Chance: [10]" + Array.get(currentScore, 10));

    
    }    
    
}
