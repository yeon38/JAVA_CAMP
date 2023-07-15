package HSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h07();
    }

    void h07() {
      Scanner s = new Scanner(System.in);
      String input = "a"; 
      int i;

      while(true){
        System.out.println("===============================");
        System.out.print("=> Enter a sentence ('x' for exit) > ");
        input = s.nextLine();
        if(input.equals("x")) break;
        System.out.printf("=> Number of character is %d\n", input.length());
        for(i=0; i<input.length(); i++){
          System.out.println("=> "+input.charAt(i));
        }
      }
      System.out.println("Exit program");
	}
}