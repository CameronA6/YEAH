
package yeah_01;
import java.util.Arrays;
import java.util.Scanner;


public class Yeah_01 {


    public static void main(String[] args) {
        ScoreSheet newGame = new ScoreSheet();

        
        int turn = 0;
        int roll = 0;
        
        int[] startDie = {1, 1, 1, 1, 1};
        //int[] startRoll = {1, 1, 1, 1, 1};
        int[] reRollDie;
        int[] numFace = new int[6];
        int[] dieValues = new int[5];
        int[] nowDie = new int[5];

        
        UsrInput usrEntry = new UsrInput();
        while(turn < 13){
        while(roll < 3){ 

            if(roll == 0){
                nowDie = startDie;
              }  
             reRollDie = usrEntry.UrsInput(roll);
            

            Dice newDice = new Dice();
            dieValues = newDice.DieRoll(reRollDie, nowDie);
            numFace = newDice.FaceVal(numFace);

            nowDie = dieValues;
            System.out.print("The Dice:" + Arrays.toString(dieValues));
            roll++;
        }


        System.out.println("\nDie Values: " + Arrays.toString(dieValues) 
                + "\nFace Values: " + Arrays.toString(numFace));
        CurrentScore nowScore = new CurrentScore();
        int[] scoreArray = new int[13];
        scoreArray = nowScore.ThisScore(numFace, dieValues);//makes Score
        nowScore.scoreNow(); //Prints
        
        System.out.println("\nSELECT SCORE [0-12]:");
        int  slctScore;
        Scanner scoreScan = new Scanner(System.in);
        slctScore = scoreScan.nextInt();

        newGame.Scores(slctScore, scoreArray);
        newGame.printScore();
roll = 0;
turn++;
        }
}    
}
   
   