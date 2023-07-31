package KSTEP;

import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);
    String[] name = new String[2];
    String[] password = new String[2];
    public static void main(String[] args) {
        Main stepK = new Main();
        stepK.k05();
    }

    void k05() {
      System.out.print("Enter id, password > ");
      name = s.nextLine().split(" ");
      System.out.println("================================================");
      System.out.println("Registered students list are as follows");
      System.out.println("------------------------------------------------");
      System.out.println("num     name    password");
      System.out.printf("1       %s    %s",name[0],name[1]);
      
	}
  

}
