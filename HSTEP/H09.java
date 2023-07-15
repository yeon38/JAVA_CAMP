package HSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h09();
    }

    void h09() {
      Scanner s = new Scanner(System.in);
      String input;
      String userInfo[]; 
      int i = 0, j = 0; 
      while(true){
        System.out.println("=============================");
        System.out.print("Enter string ('x' for exit) > ");
        input = s.nextLine();
        if(input.equals("x")) break;
        String userList[] = input.split("###");
        i = userList.length;
        System.out.printf("Total number of people is %d\n", i);
        for(j=0; j<i; j++){
          userInfo = userList[j].split("\\|");
          System.out.printf("%d %s %s\n", j+1, userInfo[0], userInfo[1]);
        }
      }
      System.out.printf("Exit program");
	}
}