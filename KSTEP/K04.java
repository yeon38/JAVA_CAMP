package KSTEP;

import java.util.Scanner;

class Main {
  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main stepK = new Main();
        stepK.k04();
    }

    void k04() {
      point now = new point();
        int count;
        int i;
        int[] num = {0, 0, 0, 0};
        System.out.print("Enter a number of coordinate > ");
        count = s.nextInt();
        int[] area = new int[count];
        for(i=0; i<count; i++){
            System.out.printf("Enter %dth coordinate (X, Y) > ", i+1);
            now.x = s.nextDouble();
            now.y = s.nextDouble();
            area[i] = get_area(now.x, now.y);
        }
        System.out.println("================================================");
        for(i=0; i<count; i++){
            if (area[i] == 1) {
                num[0]++;
                System.out.printf("%dth coordinate is located on first quadrants\n", i+1);
            } else if (area[i] == 2) {
                num[1]++;
                System.out.printf("%dth coordinate is located on second quadrants\n", i+1);
            } else if (area[i] == 3) {
                num[2]++;
                System.out.printf("%dth coordinate is located on third quadrants\n", i+1);
            } else {
                num[3]++;
                System.out.printf("%dth coordinate is located on fourth quadrants\n", i+1);
            }
        }
        System.out.println("");
        for(i=0; i<4; i++){
            System.out.printf("Number of coordinates on %dth quadrants is %d\n", i+1, num[i]);
        }
   }
  int get_area(double x, double y) {
        if (x == 0 || y == 0)
            return 0;
        else if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else
            return 4;
    }
}
class point {
    double x;
    double y;
}