package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d05();
  }
  void d05(){
    Scanner s = new Scanner(System.in);
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    while(true){
      System.out.print("Enter width, height of Rectangle > ");
      int width = s.nextInt();
      int height = s.nextInt();
      if(width<0||height<0) break;
      else{
        if(width==height){
          count1+=1;
    }
        else if(width>=2*height){
          count2+=1;
    }
        else if(height>=2*width){
          count3+=1;
    }
        else if(height>width){
          count5+=1;
    }
        else{
         count4+=1;
    }
      }
    }
    System.out.println("Count of square is "+count1);
    System.out.println("Count of an oblong rectangle from side to side is "+count2);
    System.out.println("Count of an oblong rectangle from top to bottom is "+count3);
    System.out.println("Count of a horizontal rectangle is "+count4);
    System.out.println("Count of a vertical rectangle is "+count5);
    s.close();
  }
}