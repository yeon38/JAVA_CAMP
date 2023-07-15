package GSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g05();
    }
    void g05() {
      Scanner s = new Scanner(System.in);
      int charge = 0;
      int total_charge = 0;
      while(true){
        System.out.print("Enter hours and minutes of use > ");
        int hour = s.nextInt();
        int minute = s.nextInt();
        if(hour==0&&minute==0){
          System.out.print("Your total charge is "+total_charge);
          break;
        }
        else{
          charge=(hour*2000);
          if(minute>0 && minute<40){
            charge+=1000;
          }
          else if(minute>=40){
            charge+=2000;
          }
          if(hour<2){
            System.out.println("Your charge is "+charge);
            System.out.print("\n");
            total_charge+=charge;
          }
          else if(hour>=2 && hour<3){
            charge=charge*95/100;
            System.out.println("Your charge is "+charge);
            System.out.print("\n");
            total_charge+=charge;
          }
          else if(hour>=3 && hour<5){
            charge=charge*90/100;
            System.out.println("Your charge is "+charge);
            System.out.print("\n");
            total_charge+=charge;
          }
          else if(hour>=5){
            charge=charge*80/100;
            System.out.println("Your charge is "+charge);
            System.out.print("\n");
            total_charge+=charge;
          }  
        } 
      } 
	}
}