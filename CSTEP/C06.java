package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c06();
  }
  void c06(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter points of Korean > ");
    int kor = s.nextInt();
    System.out.print("Enter points of English > ");
    int eng = s.nextInt();
    System.out.print("Enter points of Math > ");
    int math = s.nextInt();
    int total = kor+eng+math;
    double average = (double)total/3.0;
    System.out.println("Total point is "+total);
    System.out.printf("The average is %.1f\n",average);
    if(average>=90){
      System.out.print("Your grade is A");
    }
    else if(average>=80){
      System.out.print("Your grade is B");
    }
    else if(average>=70){
      System.out.print("Your grade is C");
    }
    else if(average>=60){
      System.out.print("Your grade is D");
    }
    else{
      System.out.print("Your grade is F");
    }
  }
}
