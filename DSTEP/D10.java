package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d10();
  }
  void d10(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter two numbers > ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    for (int i = 1; i <= 100; i++) {
      if ((i % num1 == 0 || i % num2 == 0)) {
        if(!(i%num1==0 && i%num2==0)){
          System.out.print(i+" ");
        }
          
      }
    }
  }
}
