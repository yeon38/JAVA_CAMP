package ISTEP;

import java.util.Scanner;

class Main {
  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i04();
    }

    void i04() {
      int total=0, price;
      while(true){
        price = SelectMenu();
        if(price == -1) break;
        total += price;

        System.out.printf("Order price from now on is %d\n\n", total);
      }
      System.out.printf("Total price is %d", total);
    }

    int SelectMenu(){
      int[] price = {15000, 10000, 7000, 2000};
      
      System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
      int order = s.nextInt();
      
      if(order == 5) return -1;
      return price[order-1];
    }
}