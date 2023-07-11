package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c03();
  }
  void c03() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter width of Rectangle > ");
    int width = s.nextInt();
    System.out.print("Enter height of Rectangle > ");
    int height = s.nextInt();
    if(width==height){
      System.out.print("It is square");
    }
    else if(width>=2*height){
      System.out.print("It is an oblong rectangle from side to side.");
    }
    else if(height>=2*width){
      System.out.print("It is an oblong rectangle from top to bottom.");
    }
    else if(height>width){
      System.out.print("It is a vertical rectangle.");
    }
    else{
      System.out.print("It is a horizontal rectangle.");
    }
  }
}