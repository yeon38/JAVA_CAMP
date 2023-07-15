package HSTEP;

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
      Main stepH = new Main();
      stepH.h02();
  }

  void h02() {
    int lotto[] = new int[6]; 
    int count;
    
    Random r = new Random();
    Scanner s = new Scanner(System.in);
   
    while(true) {
      count = 0;
      System.out.print("The generated lotto numbers are ");
      for(int i=0; i<6; i++) {
        boolean dup = true; 
        lotto[count] = r.nextInt(45)+1;
        for(int j=0; j<count; j++) {
          if(lotto[count]==lotto[j]) {
            dup = false;
            break;
          }
        }
        if(dup == true) {
          System.out.printf("%d ", lotto[count]);
          count++;
        }
        else i--;
      }
      System.out.print("\nDo you want to generate more lotto numbers? (Y/N) > ");
      String onemore = s.next();
      if(onemore.equals("N")) break;
    }
   }
}