package JSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j05();
    }
Scanner s= new Scanner(System.in);

    void j05() {

        int s_h, s_m, e_h, e_m;
        String y_n;
        int p_total = 0;
        int p;
        int count = 1;

        while(true){
            System.out.printf("Enter parking start time of %dth car (H M) > ", count);
            s_h = s.nextInt();
            s_m = s.nextInt();
            System.out.printf("Enter parking end time of %dth car (H M) > ", count);
            e_h = s.nextInt();
            e_m = s.nextInt();

            p = CalcParking(s_h, s_m, e_h, e_m);
            p_total += p;

            System.out.printf("Parking price : %d\n", p);
            System.out.print("Do you want to enter more? (Y/N) > ");
            y_n = s.next();

            if(y_n.charAt(0) == 'N')
                break;

            count++;
        }

        System.out.printf("Total price for %d cars is %d", count, p_total);

    }

    int CalcParking(int start_h, int start_m, int end_h, int end_m){

        int price1;
        int price2;

        if(start_m % 10 != 0){
            start_m = ((start_m / 10) + 1) * 10;
        }
        price1 = start_h * 3000 + (start_m /10) * 500;

        if(end_m % 10 != 0){
            end_m = ((end_m / 10) + 1) * 10;
        }
        price2 = end_h * 3000 + (end_m / 10) * 500;

        return price2 - price1;
    }
}
