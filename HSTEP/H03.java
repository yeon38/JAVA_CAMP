package HSTEP;

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Main stepH = new Main();
    stepH.h03();
  }

  void h03() {
    int lotto[] = new int[6]; 
    int lotto_user[] = new int[6];
    int count = 0;
    
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    
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
        count++;
      }
      else i--;
    }
    
    count = 0;
    
    for(int i=0; i<6; i++) {
      boolean dup = true; 
      System.out.printf("Enter your %dth lotto number > ", i+1);
      lotto_user[count] = s.nextInt();
      for(int j=0; j<count; j++) {
        if(lotto_user[count]==lotto_user[j]) {
          dup = false;
          break;
        }
      }
      if(dup == false || lotto_user[count] > 45 || lotto_user[count] < 1) {
        i--;
        System.out.println("Invalid input!");
      }
      else {
        count++;
      }
    }

    int match_count = 0;
    System.out.print("Lotto numbers of this week are ");
    for(int i=0; i<6; i++) {
      for(int j=0; j<6; j++) {
        if(lotto_user[i] == lotto[j]) {
          match_count++;
        }
      }
      System.out.printf("%d ", lotto[i]);
    }
    System.out.printf("\nThere are %d matching lotto numbers", match_count);
   }
}