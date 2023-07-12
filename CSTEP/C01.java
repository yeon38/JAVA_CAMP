package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c01();
  }
  void c01(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a birth year > ");
    int birth_year = s.nextInt();
    int age = 2022-birth_year+1;
    if(age<7){
      System.out.print("You are baby");
    }
    else if(age<13){
      System.out.print("You are child");
    }
    else if(age<20){
      System.out.print("You are teenage");
    }
    else if(age<30){
      System.out.print("You are youth");
    }
    else if(age<60){
      System.out.print("You are middle-age");
    }
    else{
      System.out.print("You are old age");
    }
    s.close();
  }
}
