package ISTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i01();
    }

    void i01() {
      Scanner s = new Scanner(System.in);
      int total=0;
      int[] price = {15000, 10000, 7000, 2000};
      int order;

      while(true){
        ShowMenu();
        order = s.nextInt();
        if(order == 5) break;
        total += price[order-1];

        System.out.printf("Order price from now on is %d\n\n", total);
      }
      System.out.printf("Total price is " + total);
      
	  }


    void ShowMenu(){
      System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
    }
}