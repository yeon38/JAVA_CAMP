package FSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f04();
    }

    void f04() {
      Scanner s = new Scanner(System.in);
      int jumsu[][] = new int[5][3];
      int sum[] = new int[5];
      double average[] = new double[5];
      int i, j;
      for(i=0; i<5; i++){
        System.out.printf("Enter Korean, English, Math score of %dth student > ", i+1);
        for(j=0; j<3; j++){
          jumsu[i][j] = s.nextInt();
        }
      }
      sum[0] = 0;
      sum[1] = 0;
      sum[2] = 0;
      sum[3] = 0;
      sum[4] = 0;
      for(i=0; i<5; i++){
        for(j=0; j<3; j++){
          sum[i] += jumsu[i][j];
        }
        average[i] = sum[i]*1.0/3;
      }
      for(i=0; i<5; i++){
        System.out.printf("Total score of %dth student is %d, average is %.1f\n", i+1, sum[i], average[i]);
      }
	}
}
