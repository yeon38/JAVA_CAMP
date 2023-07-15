package JSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j09();
    }

    void j09() {
      Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers > ");
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        System.out.printf("%d square of %d is %d",b,a,power(a,b));
    }

    int power( int num1, int num2 ) {
        int result=1;
        for(int i =0; i<num2; i++){
            result*=num1;
        }
        return result;
   }
}