package FSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Main stepF = new Main();
      stepF.f05();
  }

  void f05() {
    Scanner s = new Scanner(System.in);
    float bmilist[][] = new float[10][3];
    int count = 0;
    for(int i=0; i<10; i++) {
      System.out.print("Enter height(cm) and weight(kg) ");
      int height = s.nextInt();
      int weight = s.nextInt();
      float bmi = (float)weight / (((float)height/100) * ((float)height/100));
      bmilist[i][0] = height;
      bmilist[i][1] = weight;
      bmilist[i][2] = bmi;
    }
    for(int i=0; i<10; i++) {
      if(bmilist[i][2]>=25) {
        count++;
        System.out.printf("%dth person is obesity\n", i+1);
      }
    }
    System.out.printf("%d people is obesity", count);
   }
}