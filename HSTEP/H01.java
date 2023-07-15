package HSTEP;

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Main stepH = new Main();
    stepH.h01();
  }

  void h01() {
    int count = 0;
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int answer = r.nextInt(100)+1;
   
    while(true) {
       System.out.print("Guess the number from 1 to 100 > ");
      int number_try = s.nextInt();
      count++;
      if(answer < number_try) System.out.println("Down!");
      else if(answer > number_try) System.out.println("Up!");
      else break;
    }
    System.out.printf("You figured out the number in %d times",count);
   }
}