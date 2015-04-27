
package yeah_01;
import java.util.Arrays;
import java.util.Scanner;

/*Here is the main class of the Yeah program.
 * it controlls a nuber of arrays which act as dices, die faces,
 * current scores, & a score card.
 */
public class Yeah_01 {

    public static void main(String[] args) {
        ScoreSheet newGame = new ScoreSheet(); // creates a score sheet

       //these variables will keep take of our place in the game.
        int turn = 0;
        int roll = 0;

        int[] startDie = {1, 1, 1, 1, 1};// Starts us rolling all the dice.
        int[] reRollDie; // which die will be reRolled
        int[] numFace = new int[6]; //where the number of each values [1-6] given by the dice
        int[] dieValues = new int[5];//where the current face value of each die is stored
        int[] nowDie = new int[5];//where the allows the use of the startDie

        UsrInput usrEntry = new UsrInput(); //simple user input
        // keeps take of our place in the game. Still playing while inside turn, still rolling while in roll
        while(turn < 13){
        while(roll < 3){

            if(roll == 0){ //initializes a new round of dice
                nowDie = startDie;
              }
             reRollDie = usrEntry.UrsInput(roll); // if it's not the first roll we choose dice to roll

            // Creates a Dice class. Passes the current dice values and what will be reRolled. Returns a new dice array.
            Dice newDice = new Dice();
            dieValues = newDice.DieRoll(reRollDie, nowDie);
            numFace = newDice.FaceVal(numFace); //gets the face values for the dice that were just created.

            // resets the nowDie array and prints our new array
            nowDie = dieValues;
            System.out.print("The Dice:" + Arrays.toString(dieValues));
            roll++; //increase roll
        }


        //prints our arrays vaules for testing
        System.out.println("\nDie Values: " + Arrays.toString(dieValues)
                + "\nFace Values: " + Arrays.toString(numFace));

        //creates a CurrentScore & an array to store the info produced.
        CurrentScore nowScore = new CurrentScore();
        int[] scoreArray = new int[13];
        scoreArray = nowScore.ThisScore(numFace, dieValues);//makes Score
        nowScore.scoreNow(); //Prints

        // Allows the selection of a score to mark. Prints prompt
        System.out.println("\nSELECT SCORE [0-12]:");
        int  slctScore;
        Scanner scoreScan = new Scanner(System.in); //user input
        slctScore = scoreScan.nextInt();

        newGame.Scores(slctScore, scoreArray); //adds the selected score
        newGame.printScore();
roll = 0; //restarts rolls
turn++; //increase turns
        }
}
}


