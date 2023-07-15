package ISTEP;

import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i05();
    }

    void i05() {
      System.out.println("Find the maximum of 10 numbers");
      int max = MaxOfTen();
      System.out.printf("\nMaximum value is %d", max);
    }

  int MaxOfTen(){
    int input, max=-1;
    for(int i=0; i<10; i++){
      System.out.printf("Enter %dth number > ", i+1);
      input = s.nextInt();
      if(i==0) max = input;
      else if(input > max) max = input;
    }
    return max;
  }
}