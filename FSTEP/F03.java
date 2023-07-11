package FSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f03();
    }

    void f03() {
      Scanner s = new Scanner(System.in);
      int jumsu[][] = new int[5][3];
      int sum[] = new int[3];
      double average[] = new double[3]; 
      int kor, eng, mat;
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
      for(i=0; i<5; i++){
        sum[0] += jumsu[i][0];
        sum[1] += jumsu[i][1];
        sum[2] += jumsu[i][2];
      }
      average[0] = sum[0]*1.0/5;
      average[1] = sum[1]*1.0/5;
      average[2] = sum[2]*1.0/5;
      System.out.printf("Total Korean score is %d, average is %.1f\n", sum[0], average[0]);
      System.out.printf("Total English score is %d, average is %.1f\n", sum[1], average[1]);
      System.out.printf("Total Math score is %d, average is %.1f\n", sum[2], average[2]);
	}
}
