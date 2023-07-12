package ESTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e01();
  }
  void e01(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a length of rectangle > ");
    int size = scanner.nextInt();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print("# ");
      }
      System.out.println();
    }
    scanner.close();
  }
}