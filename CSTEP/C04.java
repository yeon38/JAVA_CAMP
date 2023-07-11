package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c04();
  }
  void c04(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter area of Apartment(m^2) > ");
    double m2_area = s.nextDouble();
    double pyung_area = m2_area/3.305;
    System.out.printf("Area of Apartment(pyung) %.1f\n",pyung_area);
    if(pyung_area<15){
      System.out.print("It is small-sized apartment");
    }
    else if(pyung_area<30){
      System.out.print("It is small and medium-sized apartment");
    }
    else if(pyung_area<50){
      System.out.print("It is medium-sized apartment");
    }
    else{
      System.out.print("It is big-sized apartment");
    }
  }
}
