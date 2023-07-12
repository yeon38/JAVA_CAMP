package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c09();
  }
  void c09(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your income > ");
    int income = s.nextInt();
    int tax = 0;
    if(income<10000000){
      tax = (income*95)/1000;
    }
    else if(income<40000000){
      tax = income*19/100;
    }
    else if(income<80000000){
      tax = income*28/100;
    }
    else if(income>=80000000){
      tax = income/100*37; 
    }
  System.out.print("Income tax on salary is " +tax);
  s.close();
  }
}

