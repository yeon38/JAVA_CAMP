package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c08();
  }
  void c08(){
    int num[] = new int[3];
    Scanner s =  new Scanner(System.in);
    System.out.print("Enter first number > ");
    int num1 = s.nextInt();
    System.out.print("Enter second number > ");
    int num2 = s.nextInt();
    System.out.print("Enter third number > ");
    int num3 = s.nextInt();
    num[0]=num1;
    num[1]=num2;
    num[2]=num3;
    int max_num = 0;
    int min_num = 50;
    for(int i=0;i<3;i++){
      if(num[i]>max_num){
        max_num=num[i];
      }
    }
    for(int i=0;i<3;i++){
      if(num[i]<min_num){
        min_num=num[i];
      }
    }
    System.out.printf("Max number is %d, Min number is %d",max_num,min_num);
    s.close();
  }
}
