
package yeah_01;

import java.util.Arrays;
import java.util.Random;


public class Dice {
    
   int[] dieNum = new int[5];
   int[] faceNum = new int[6];
   
    public int[] DieRoll(int[] numToRoll, int[] currentDie){
       
        dieNum = currentDie;
        int[] thisRoll = new int[5];
              thisRoll = numToRoll;
        for(int i = 0; i <  5; i++){

                int x = thisRoll[i];

                if(x != 0){
                Random randomGen = new Random();
                int faceValue = randomGen.nextInt(6);
                faceValue++;

                dieNum[i] = faceValue;
               // System.out.print(i + "-" + dieNum[i] +",");
                }

        }
       
    return dieNum;
    }

    public int[] FaceVal(int[] currentFace){
        
        for(int i = 0; i < 5; i++){
            int x = dieNum[i];
            
            switch (x){
                case 1: faceNum[0]++;
                    break;
                case 2: faceNum[1]++;
                    break;
                case 3: faceNum[2]++;
                    break;
                case 4: faceNum[3]++;
                    break;
                case 5: faceNum[4]++;
                    break;
                case 6: faceNum[5]++;
                    break;
            }   
        }
    return faceNum;
    }
        
}
    
    

  
