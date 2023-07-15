package JSTEP;

import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j02();
    }

    void j02() {
      double [] num = new double [10];
      double max;
      double min;
      double total = 0.0;
      double average = 0.0;
      for(int i=0;i<10;i++){
        System.out.printf("Enter %dth score > ",i+1);
        num[i] = s.nextDouble(); 
      }
      max = Max(num);
      min = Min(num);
      
      for(int i=0;i<10;i++){
        if(num[i]==max || num[i]==min) continue;
        else total += num[i];
      }
      
      average = total/8.0;
      average = average - 0.1;
      System.out.print("Average is ");
      System.out.print(String.format("%.1f", average));
    }
  double Max(double num[]){
    double maxnum = 0.0;
    for(int i=0;i<10;i++){
      if(num[i]>maxnum) maxnum = num[i];
    }
    return maxnum;
  }
  double Min(double num[]){
    double minnum = 7.0;
    for(int i=0;i<10;i++){
      if(num[i]<minnum) minnum = num[i];
    }
    return minnum;
  }
}