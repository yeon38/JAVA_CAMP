package KSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepK = new Main();
        stepK.k03();
    }

    void k03() {
      Scanner s = new Scanner(System.in);
        int []count = {0,0,0,0};
        String []name = {"first","second","third","forth"};
        point p = new point();
        System.out.print("Enter coordinate (X, Y) > ");
        p.x = s.nextDouble();
        p.y = s.nextDouble();
        int result = get_area(p.x,p.y);
        count[result-1]++;
        System.out.println("================================================");
        System.out.printf("Coordinate is located on %s quadrants\n",name[result-1]);
        for(int i = 0; i<4; i++){
            System.out.printf("Number of coordinates on %dth quadrants is %d\n",i+1,count[i]);
        }
   }
  int get_area(double x, double y){
        if(x == 0 || y == 0)return 0;
        else if(x > 0 && y > 0) return 1;
        else if(x < 0 && y > 0) return 2;
        else if(x < 0 && y < 0) return 3;
        else return 4;
    }

}
class point {
    double x;
    double y;
}
