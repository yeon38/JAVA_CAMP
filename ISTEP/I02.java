package ISTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i02();
    }

    void i02() {
      Scanner s = new Scanner(System.in);

      System.out.print("Enter a character to draw triangle > ");
      char ch = s.next().charAt(0);
      System.out.print("Enter a height of right triangle and blank > ");
      int size = s.nextInt();
      int blanks = s.nextInt();
      PrintCharWithBlank(blanks, size, ch);
	 }

  void PrintCharWithBlank(int blanks, int size, char ch){
    for(int i=size; i>0; i--){
      // blank
      for(int j=0; j<i+blanks-1; j++){
        System.out.print(" ");
      }
      // character
      for(int j=size-i+1; j>0; j--){
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}