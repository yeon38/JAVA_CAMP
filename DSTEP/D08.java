package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d08();
  }
  void d08(){
     Scanner s = new Scanner(System.in);
    System.out.print("Enter the coefficients a and b of quadratic function(y=ax^2+bx+c) > ");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    System.out.print("Enter the start and end values of x coordinates > ");
    int x_begin = s.nextInt();
    int x_end = s.nextInt();
    //int x=0;
    int y=0;
    for(int i=x_begin;i<=x_end;i++){
      y= (a*i*i) + b*i +c;
      if(i==x_end){
        System.out.printf("coordinates (%d, %d)",i,y);
      }
      else{
        System.out.printf("coordinates (%d, %d)\n",i,y);
      }
    }
    s.close();
  }
}
