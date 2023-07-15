package GSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepG = new Main();
    stepG.g02();
  }

  void g02() {
    Scanner s = new Scanner(System.in);
    double[] degrees = new double[10];
    String[] degree_name = {"cold", "warm", "hot", "boiling"};
    int[] count = {0,0,0,0};
    int[] sel = new int[10];
    
    for(int i=0; i<10; i++) {
      System.out.print("Enter water temperature > ");
      double input_degree = s.nextFloat();
      degrees[i] = input_degree;
      if(degrees[i] >= 80) {
        count[3]++;
        sel[i] = 3;
      }
      else if(degrees[i] >= 40) {
        count[2]++;
        sel[i] = 2;
      }
      else if(degrees[i] >= 25) {
        count[1]++;
        sel[i] = 1;
      }
      else if(degrees[i] >= 0) {
        count[0]++;
        sel[i] = 0;
      }
        
      
    }
    System.out.println();
     for(int i=0; i<10; i++) {
      System.out.printf("%dth water temperature is %.1f %s water\n", i+1, degrees[i], degree_name[sel[i]]);
    }
    System.out.println();
     System.out.println("Count of cold water is "+count[0]);
    System.out.println("Count of warm water is "+count[1]);
    System.out.println("Count of hot water is "+count[2]);
    System.out.println("Count of boiling water is "+count[3]);
   
   }
}