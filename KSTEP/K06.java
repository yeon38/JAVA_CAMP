package KSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepK = new Main();
        stepK.k06();
    }

   void k06() {
      Scanner s = new Scanner(System.in);
      String[] name = new String[5];
      String[] password = new String[5];
      System.out.print("Enter a number of students > ");
      int l = s.nextInt();
      
      
      for(int i = 0; i<l; i++){
        String a;
        System.out.printf("Enter id, password of %dth student > ",i+1);  
        name[i] = s.next();
        password[i] = s.next();        
      }
      
      System.out.println("================================================");
      System.out.printf("Registered %d students list are as follows\n",l);
      System.out.println("------------------------------------------------");
      System.out.println("num     name    password");
      for(int i = 0; i<l; i++){
        System.out.printf("%d       %-5s   %s\n",i+1,name[i],password[i]);  
      }
}
}