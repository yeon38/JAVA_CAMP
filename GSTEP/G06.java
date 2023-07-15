package GSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g06();
    }

    void g06() {
      Scanner s = new Scanner(System.in);
      int[] order = {0,0,0}; // 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
      int sale = 0; // 계산한 판매금액
      int total_sale = 0; // 총 매출액 총액
      int[] total_order = {0,0,0}; // 총 판매 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
      int[] price = {10000, 6000, 3000}; // 제품별 가격
      int i; 
      System.out.println("There are three type of products\n(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)");
      System.out.print("\n");
      while(true){
          System.out.print("How many first products do you want to buy? > ");
          order[0]=s.nextInt();
          System.out.print("How many second products do you want to buy? > ");
          order[1]=s.nextInt();
          System.out.print("How many third products do you want to buy? > ");
          order[2]=s.nextInt();
        if(order[0]==0&&order[1]==0&&order[2]==0){
          System.out.print("Total price from now on is "+total_sale);
          break;
        }
        else{
          total_order[0]+=order[0];
          total_order[1]+=order[1];
          total_order[2]+=order[2];
          sale = order[0]*price[0] + order[1]*price[1] + order[2]*price[2];
          System.out.println("The price is "+sale);
          System.out.print("\n");
          total_sale+=sale;
        }  
      }
	}
}