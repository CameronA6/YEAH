
package yeah_01;

// This tells us if we have a straight
public class Straights {

    public int[] StrtScores(int[] toMult){

        int [] strtScores = new int[2]; //we need two arrays for large/small straight.

        boolean smStraight = false; //bool to use later for large straight
        int zeroCount = 0;

        // This was hard. It counts uses a for loop to move through our die value array.
        // if it encounters a number > 0 it keeps going, adding 1 to a zeroCount.
        // if it encounters a 0, then the zeroCount is reset to 0. If after going
        // through the array there is at any point a zeroCount of 4, we know that there
        // has been a small straight scored.
        for(int i = 0; i < 6; i++){

            int x = toMult[i];

            if(x != 0){
                zeroCount++;
            }else
                zeroCount = 0;

            if (zeroCount == 4){
                smStraight = true;
            }
        }

        // Here is were we judge for a large straight.
        // If we have a small straight and the largest number is our toMult array is 1
        // then we have a large straight
        boolean lgStraight = false;
        int total = 1;
        for(int i : toMult) if(toMult[i] != 0) total *= i;
        if(smStraight && (total == 1)) lgStraight = true;

        if(smStraight) strtScores[0] = 30;
        if(lgStraight) strtScores[1] = 40;

        return strtScores;
    }

}
