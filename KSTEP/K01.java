package KSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    MenuPan stepK = new MenuPan();
    stepK.input();
    stepK.output(MenuPan.num, MenuPan.name, MenuPan.origin, MenuPan.price);
  }
 
}

 class MenuPan {
    static int num, price;
    static String name, origin;

    void input() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number, name, origin, price > ");
        num = s.nextInt();
        name = s.next();
        origin = s.next();
        price = s.nextInt();

    }

    void output(int num, String name, String origin, int price){
        System.out.println("================================================");
        System.out.println("num     name     origin     price");
        System.out.printf("%3d     %s      %s     %d", num, name, origin, price);
    }
 }