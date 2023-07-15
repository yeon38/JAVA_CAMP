package JSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j07();
    }

    void j07() {    
      Scanner s = new Scanner(System.in);
        int power;
        int ans;
        while(true){
            System.out.print("Enter a number. (0 for exit) > ");
            power = s.nextInt();
            if(power == 0) break;
            ans = poweroftwo(power);
            System.out.printf("%d square of 2 is %d\n", power, ans);
        }
    }

    int poweroftwo(int n){
        if(n==0){
            return 1;
        }
        else {
            return (2*poweroftwo(n-1));
        }
     }
}