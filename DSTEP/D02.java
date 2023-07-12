package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d02();
  }
  void d02() {
    Scanner s = new Scanner(System.in);
    int max_num = 0;
    int min_num = 50;
    while(true){
      System.out.print("Enter a number > ");
      int number = s.nextInt();
      if(number<0||number>100){
        break;
      }
      else{
        if(number>max_num) max_num=number;
        if(number<min_num) min_num=number;
      }  
    }
    System.out.printf("Max number is %d, Min number is %d",max_num,min_num);
    s.close();
  }
}
