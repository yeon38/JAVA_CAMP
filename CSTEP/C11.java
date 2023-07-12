package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c11();
  }

  void c11() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a year > ");
    int year = s.nextInt();
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.print("This year is leap year");
        } else {
          System.out.print("This year is not leap year");
        }
      } else {
        System.out.print("This year is leap year");
      }
    } 
    else {
      System.out.print("This year is not leap year");
    }
    s.close();
  }
}

