package HSTEP;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h04();
    }

    void h04() {
      Scanner s = new Scanner(System.in);
      Random rand = new Random();
      int com_finger = 0; 
      int my_finger = 0;
      int score[][] = new int[2][3];
      String[] list = {"Scissors","Rock","Paper"};
      while(true) {
        System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
        my_finger = s.nextInt();
        if(my_finger==0){
          System.out.printf("Computer : win - %d, lost - %d, draw - %d\n",score[0][0],score[0][2],score[0][1]);
          System.out.printf("User : win - %d, lost - %d, draw - %d",score[1][0],score[1][2],score[1][1]);
          break;
        }
        else{
          com_finger = rand.nextInt(3);
          System.out.printf("What the computer has given out is %s —>\n",list[com_finger]);
          if((my_finger==1 && com_finger==0)||(my_finger==2 && com_finger==1)||(my_finger==3 && com_finger==2)){
            System.out.print("Draw!\n");
            score[0][1]+=1;
            score[1][1]+=1;
          }
          else if((my_finger==1 && com_finger==2)||(my_finger==2 && com_finger==0)||(my_finger==3 && com_finger==1)){
            System.out.print("You win!\n");
            score[0][2]+=1;
            score[1][0]+=1;
          }
          else {
            System.out.print("Computer win!\n");
            score[0][0]+=1;
            score[1][2]+=1;
          }
        }
      }  
	}
}