package FSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f02();
    }

    void f02() {
      try (Scanner scanner = new Scanner(System.in)) {
        double score[] = new double[10];
        float max, min; 
        float total = 0;
        float avg;
        float newnum;
        int i;
        for(i=0; i<10; i++){
          System.out.printf("Enter %dth score > ", i+1);
          newnum = scanner.nextFloat();
          score[i] = newnum;
        }
        max = (float)score[0];
        min = (float)score[0];
        
        for(i=0; i<10; i++){
          total += (float)score[i];
          if(score[i] > max) max = (float)score[i];
          if(score[i] < min) min = (float)score[i];
        }
        total -= (max + min);
        avg = total/8;
        System.out.printf("Average is %.1f", avg);
        scanner.close();
      }
	}
}