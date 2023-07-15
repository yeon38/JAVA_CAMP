package JSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j03();
    }
Scanner s = new Scanner(System.in);
    void j03() {
      double[] degree = new double[10];
        String[] water = {"cold","warm","hot","boiling"};
        int[] total = new int[4];
        int l;
        for(int i = 0; i<10; i++){
            System.out.printf("Enter %dth water temperature > ",i+1);
            degree[i] = s.nextDouble();
        }
        for(int i = 0; i<10; i++){
            l = AskWater(degree[i]);
            total[l]++;
            System.out.printf("%dth water temperature is %.1f %s water\n",i+1,degree[i],water[l]);
        }
        for(int i = 0; i<4; i++){
            System.out.printf("Count of %s water is %d\n",water[i],total[i]);
        }
   }
  byte AskWater(double degree){
        if(degree>=80){
            return 3;
        }
        else if(degree>=40){
            return 2;
        }
        else if(degree>=25){
            return 1;
        }
        else{return 0;}
    }
}