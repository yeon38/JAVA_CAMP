package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d03();
  }
  void d03(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number from 0 to 100 > ");
    int count = 0;
    int totalsum = 0;
    double average = 0;
    while(true){
      System.out.print("Enter a number from 0 to 100 > ");
      int number = s.nextInt();
      if(number<0||number>100) break;
      else{
        count+=1;
        totalsum+=number;
      }
    }
    average = (double)totalsum/(double)count;
    System.out.printf("The sum of %d numbers is %d, average is %.1f",count,totalsum,average);
    s.close();
  }
}