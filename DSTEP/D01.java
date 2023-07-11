package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d01();
  }
  void d01(){
   Scanner s = new Scanner(System.in);
    System.out.print("Enter a number > ");
    int number = s.nextInt();
    int i=0;
    int totalsum = 0;
    if(number<=1){
      System.out.print("Invalid input");
    }
    else{
      for(i=0;i<number;i++){
        totalsum +=(number-i);
      }
    }
    System.out.print("The sum of all integer from 1 to the number entered is "+totalsum);
    
  }
}