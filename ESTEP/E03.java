package ESTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e03();
  }
  void e03(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a height of triangle > ");
    int height = sc.nextInt(); 
    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= height - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (i*2)-1; j++) {
        System.out.print("*");
        
      }
      System.out.print("\n");
    }
  }
}
