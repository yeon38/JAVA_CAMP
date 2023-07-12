package ESTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e06();
  }
  void e06(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a rows and columns > ");
    int rows = s.nextInt();
    int columns = s.nextInt();
    for(int i=1;i<=columns;i++){
      for(int j=1;j<=rows;j++){
        System.out.printf("%3d ",j*i);
      }
      System.out.print("\n");
    }
    s.close();
  }
}