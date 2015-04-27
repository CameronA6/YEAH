
package yeah_01;


public class Straights {
    
    public int[] StrtScores(int[] toMult){
        
        int [] strtScores = new int[2];
        
        boolean smStraight = false;
        int zeroCount = 0;
        
        for(int i = 0; i < 6; i++){
                
            int x = toMult[i];

            if(x != 0){
                zeroCount++;
            }else
                zeroCount = zeroCount * 0;

            if (zeroCount == 4){
                smStraight = true;
            }
        }
        
        boolean lgStraight = false;
        int total = 1;
        for(int i : toMult) if(toMult[i] != 0) total *= i;
        if(smStraight && (total == 1)) lgStraight = true;
        
        if(smStraight) strtScores[0] = 30;
        if(lgStraight) strtScores[1] = 40;
        
        return strtScores;
    }
    
}
