package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d06();
  }
  void d06(){
    Scanner s = new Scanner(System.in);
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    for(int i=0;i<10;i++){
      System.out.print("Enter area of Apartment(m^2) > ");
      double m2_area = s.nextDouble();
      double pyung_area = m2_area/3.305;
      
      System.out.printf("Area of Apartment(pyung) %.1f\n",pyung_area);
      
      if(pyung_area<15){
        count1+=1;
      }
      else if(pyung_area<30){
        count2+=1;
      }
      else if(pyung_area<50){
        count3+=1;
      }
      else{
        count4+=1;
      }
    }
    
    System.out.println("Count of small-sized apartment is "+count1);
    System.out.println("Count of small and medium-sized apartment is "+count2);
    System.out.println("Count of medium-sized apartment is "+count3);
    System.out.println("Count of big-sized apartment is "+count4);
    s.close();
  }
}