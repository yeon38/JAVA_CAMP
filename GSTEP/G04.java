package GSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g04();
    }

    void g04() {
      Scanner s = new Scanner(System.in);
      int charge = 0;
      int total_charge = 0;
      while(true){
        System.out.print("Enter the type of real estate transaction(1:Trading, 2:Lease, 0:exit) > ");
        int kind = s.nextInt();
        if(kind==0){
          System.out.print("Total charge is "+total_charge);
          break;
        }
        else{
           System.out.print("Enter the amount of real estate transaction. > ");
        int money = s.nextInt();
        if(kind==1){
          if(money<50000000){
            charge = money * 6/1000;
            if(charge>=250000) charge = 250000;
            total_charge+=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
          else if(money<200000000){
            charge = money * 5/1000;
            if(charge>=800000) charge = 800000;
            total_charge+=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
          else{
            charge = money * 4/1000;
            total_charge +=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
        }
        else if(kind==2){
          if(money<20000000){
            charge = money * 5/1000;
            if(charge>=70000) charge = 70000;
            total_charge+=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
          else if(money<50000000){
            charge = money * 5/1000;
            if(charge>=200000) charge = 200000;
            total_charge+=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
            else if(money<100000000){
            charge = money * 4/1000;
            if(charge>=300000) charge = 300000;
            total_charge+=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
          else{
            charge = money * 3/1000;
            total_charge+=charge;
            System.out.println("The charge is "+charge);
            System.out.print("\n");
          }
        }
        }
      }
      
	}
}