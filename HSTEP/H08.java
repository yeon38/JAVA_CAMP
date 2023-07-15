package HSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Main stepH = new Main();
      stepH.h08();
  }

  void h08() { 
    Scanner s = new Scanner(System.in);
    String input;
    String findstr;
    String replace;
    int i = 0;
    while(true){
      i = 0;
      System.out.println("===============================");
      System.out.print("=> Enter a sentence ('x' for exit) > ");
      input = s.nextLine();
      if(input.equals("x")) break;
      System.out.print("=> Enter a sentence to find > ");
      findstr = s.nextLine();
      System.out.print("=> Enter a sentence to replace > ");
      replace = s.nextLine();
      while(!input.replaceFirst(findstr, replace).equals(input)){
        input = input.replaceFirst(findstr, replace);
        i++;
      }
      System.out.printf("=> The replacement occurred %d times\n", i);
      System.out.println("=> "+input);
    }
    System.out.print("Exit program");
  }
}