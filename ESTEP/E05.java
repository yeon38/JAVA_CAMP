package ESTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e05();
  }
  void e05(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
    int mode = s.nextInt();
    System.out.print("Enter a numbers of column > ");
    int column = s.nextInt();
    if(mode==1){
      for(int i=3;i<=9;i++){
        if(i%2==0) continue;
        for(int j=1;j<=9;j++){
          System.out.printf("%d X %d = %d\t",i,j,j*i);
          if(j%column==0) System.out.print("\n");
        }
        System.out.print("\n");
      }
    }
    else{
      for(int i=2;i<=8;i++){
        if(i%2==1) continue;
        for(int j=1;j<=9;j++){
          System.out.printf("%d X %d = %d\t",i,j,j*i);
          if(j%column==0) System.out.print("\n");
        }
        System.out.print("\n");
      }
    }
    s.close();
  }
}
