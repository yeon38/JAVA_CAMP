package GSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepG = new Main();
    stepG.g03();
  }

  void g03() {
    Scanner s = new Scanner(System.in);
    int[][] jumsu = new int[5][3];  // 3과목 점수, 총점을 저장하고 있는 중복 리스트
    int[] c_sum = new int[3];
    double[] c_average = new double[3];
    String[] c_name = {"Korean","English","Math"};
    int[] sum = new int[5];
    double[] average = new double[5];
    String grade;
    
    for(int i=0; i<5; i++) {
      System.out.printf("Enter Korean, English, Math score of %dth student > ",i+1);
      for(int j=0; j<3; j++) {
        jumsu[i][j] = s.nextInt();
      }
    }

    System.out.println("\n1) Total score and average for each subjects");
    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
       c_sum[i] += jumsu[j][i];
      }
      c_average[i] = c_sum[i] / 5.0;
      System.out.printf("Total %s score is %d, average is %.1f\n", c_name[i], c_sum[i], c_average[i]);
    }
        
    System.out.println("\n2) Total score and average for each students");
    for(int i=0; i<5; i++) {
      for(int j=0; j<3; j++) {
        sum[i] += jumsu[i][j];
      }
      average[i] = sum[i] / 3.0;
      if(average[i] >= 90) grade = "A";
      else if(average[i] >= 80) grade = "B";
      else if(average[i] >= 70) grade = "C";
      else if(average[i] >= 60) grade = "D";
      else grade = "F";
      System.out.printf("%dth student score: Total - %d, average - %.1f, grade - %s\n", i+1, sum[i], average[i], grade);
    }
    
   }
}