package FSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepF = new Main();
    stepF.f08();
  }

  void f08() {
    Scanner s = new Scanner(System.in);
    int number[] = new int[10];
    int count=0;
    System.out.println("Enter a number from 1 to 100");
    for(int i=1; i<=10; i++) {
      boolean dup = true; 
      System.out.print("Enter "+i+"th number > ");
      int newnum = s.nextInt();
      for(int j=0; j<10; j++) {
        if(newnum == number[j]) {
          dup = false;
          break;
        }
      }
      if(dup==false) {
        i--;
        System.out.println("Invalid input!");
      } else {
        number[count] = newnum;
        count++;
      }
    }
    for(int i=0; i<10; i++) {
      System.out.printf("%dth number is %d\n", i+1, number[i]);
    }
    s.close();
   }
}
