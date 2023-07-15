package ISTEP;

import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i07();
    }

    void i07() {
      int c ;
      int total = 0;
      int count = 0;
      String y = "";
      
      while(true){
        System.out.print("1. Cola(700) 2. coffee(300) 3. lemon tea(1000) 4. milk tea(500) 5. cocoa(600)\n");
        c= SelectCan();
        total+=c;
        count+=1;
        System.out.print("Do you need more menu? (Y/N) > ");
        y = s.next();
        if(y.equals("N")){
          System.out.printf("Total price for %d drinks is %d",count,total);
          break;
        }
        else{
          System.out.print("\n");
        }
      }
	}
  
  int SelectCan(){
    int menu;
    int cost = 0;
    System.out.print("Please select menu > ");
    menu = s.nextInt();
    
    if(menu==1) cost = 700;
    else if(menu==2) cost = 300;
    else if(menu==3) cost = 1000;
    else if(menu==4) cost = 500;
    else cost = 600;
  
  return cost;
  }
}

