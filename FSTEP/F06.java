package FSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f06();
    }

    void f06(){
      Scanner s = new Scanner(System.in);
      //int number[][] = new int[5][3];
      int total = 0;
      for(int i=1;i<=5;i++){
        for(int j=1;j<=3;j++){
          System.out.printf("Enter number of people in room %d0%d > ",i,j);
          int newnum = s.nextInt();
          total+=newnum;
        }
      }
      System.out.print("Number of people living in this apartment is "+total);
      s.close();
	}
}
