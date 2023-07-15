package HSTEP;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h01();
    }

    void h01() {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter number of coins > ");
      int coins = s.nextInt();
      int[] number = {0, 0, 0};
      int dummy = 0;; 
      int i =1; 
      Random random = new Random();
      while(true){
        if(coins==0){
          System.out.print("Game over!");
          break;
        }
        else{
          System.out.printf("Start %dth game !!! (Enter any number) > ",i);
          dummy = s.nextInt();
          i+=1;
          
          for(int j=0;j<3;j++){
            number[j]= random.nextInt(10)+1;
          }
          if(number[0]!=number[1] && number[1]!=number[2] && number[0]!=number[2]){
            System.out.printf("Result of game: %d %d %d —> Failed…\n",number[0],number[1],number[2]);
            coins-=1;
          }
          else if(number[0]==number[1] || number[1]==number[2] || number[0]==number[2]){
            System.out.printf("Result of game: %d %d %d —> match 2 numbers! got two more coins\n",number[0],number[1],number[2]);
            coins-=1;
            coins+=2;
          }
          else {
            System.out.printf("Result of game: %d %d %d —> match 3 numbers! got four more coins\n",number[0],number[1],number[2]);
            coins-=1;
            coins+=4;
          }
          System.out.printf("There are %d coins remaining.\n\n",coins);   
        }
      }
	}
}