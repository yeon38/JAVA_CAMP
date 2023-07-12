package DSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d04();
  }
  void d04(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of family members > ");
    int count_all = s.nextInt();
    int count_young = 0;
    for(int i=0;i<count_all;i++){
      System.out.print("Enter a birth year > ");
      int birth_year = s.nextInt();
      int age = 2022-birth_year+1;
      if(age<20) count_young+=1;
    }
    System.out.printf("There are %d youngs in the family.",count_young);
    s.close();
  }
}