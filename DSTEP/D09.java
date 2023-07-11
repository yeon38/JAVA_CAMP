package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d09();
  }
  void d09(){
    Scanner s = new Scanner(System.in);
    
    while(true){
      System.out.print("Enter number of gugudan(2~9) > ");
      int dan = s.nextInt();
      if(dan>=2 && dan<=9){
        for(int i=1;i<=9;i++){
          System.out.printf("%d X %d = %d\n",dan,i,dan*i);  
        }
        break;
      }
      else{
        System.out.println("Invalid input");
      }
    }
    
  }
}
