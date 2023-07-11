package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c02();
  }
  void c02(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter water temperature > ");
    double input_degree = s.nextDouble();
    if(input_degree<0){
      System.out.print("Invalid input!");
    }
    else if(input_degree<25){
      System.out.print("It's cold water");
    }
    else if(input_degree<40){
      System.out.print("It's warm water");
    }
    else if(input_degree<80){
      System.out.print("It's hot water");
    }
    else{
      System.out.print("It's boiling water");
    }
  }
}
