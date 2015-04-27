
package yeah_01;

import java.util.Scanner;

public class UsrInput {
    
    public int[] UrsInput(int inputTurn){
        Scanner uIn = new Scanner(System.in);
        int rollNum = inputTurn;
        int usrEntry = 0;
        int[] uEn = new int[5];
        
        
        switch(rollNum){
            case 0: for(int i = 0; i <  5; i++) uEn[i] = 1;
                break;
            case 1: System.out.println("Please Select num to re-roll (0 or 1): ");
                //usrEntry = uIn.nextInt();
                for(int i = 0; i <  5; i++) uEn[i] = uIn.nextInt();
                break;
            case 2: System.out.println("Last re-roll (0 or 1): ");
                //usrEntry = uIn.nextInt();
                for(int i = 0; i <  5; i++) uEn[i] = uIn.nextInt();
                break;
        }
//        int[] usrArray = new int[usrEntry];
//
//        
//        for(int i = 0; i < usrEntry; i++){
//            System.out.println("Die to re-roll (0-4): ");
//            int usrSelect = uIn.nextInt();
//            usrArray[i] = usrSelect;
//
//        }
    return uEn;
    }
    
}
