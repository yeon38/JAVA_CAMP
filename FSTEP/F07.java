package FSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f07();
    }

    void f07() {
      Scanner s = new Scanner(System.in);
      //int number[][] = new int[5][3];
      int total = 0;
      int floor_total[] = new int[5];
      int line_total[] = new int[3]; 
      int newnum = 0;
      for(int i=1;i<=5;i++){
        for(int j=1;j<=3;j++){
          System.out.printf("Enter number of people in room %d0%d > ",i,j);
          newnum = s.nextInt();
          total+=newnum;
          if(j==1) line_total[0]+=newnum;
          if(j==2) line_total[1]+=newnum;
          if(j==3) line_total[2]+=newnum;
          if(i==1) floor_total[0]+=newnum;
          if(i==2) floor_total[1]+=newnum;
          if(i==3) floor_total[2]+=newnum;
          if(i==4) floor_total[3]+=newnum;
          if(i==5) floor_total[4]+=newnum;
        }
        
      }
      for(int i=0;i<5;i++){
        System.out.printf("Number of people living in %d floor is %d\n",i+1,floor_total[i]);
      }
      System.out.print("\n");
      for(int i=0;i<3;i++){
        System.out.printf("Number of people living in %d line is %d\n",i+1,line_total[i]);
      }
      System.out.print("\n");
      System.out.print("Number of people living in this apartment is "+total);
      s.close();
	}
}
