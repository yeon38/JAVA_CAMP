package KSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Main stepK = new Main();
      MenuPan stepk = new MenuPan();
      int count;
      String[] l = new String[4];
      count = stepK.k02(s);
      for(int i = 0; i<count; i++){
        l[i] = stepk.input(s, i);
      }
      String[] l_spl;
      System.out.println("================================================");
      System.out.println("num     name     origin     price");
      for(int i =0; i<count; i++){
        l_spl = l[i].split(" ");
        stepk.output(l_spl);
      }
    }

    int k02(Scanner s) {
      int k;
      System.out.print("Enter number of menu > ");
      k = s.nextInt();
      s.nextLine();
      return k;
   }
  
}

class MenuPan{
  String line;
  String input(Scanner s, int i) {
    System.out.printf("%d: Enter number, name, origin, price > ", i+1);
    line = s.nextLine();
    return line;
  }
  void output(String[] l_spl){
    System.out.printf("%3s     %-4s     %-6s     %-4s\n", l_spl[0], l_spl[1], l_spl[2], l_spl[3]);
  }
}