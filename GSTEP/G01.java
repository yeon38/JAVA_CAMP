package GSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepG = new Main();
    stepG.g01();
  }

  void g01() {
    Scanner s = new Scanner(System.in);
    int[] age = new int[100];
    int count_person = 0; 
    int count_baby=0; // 유아 수
    int count_child=0; // 어린이 수
    int count_youth=0; // 청소년 수
    int count_young=0; // 청년 수
    int count_adult=0; // 중년 수
    int count_old=0; // 노년 수
    for(int i=0; i<100; i++) {
      System.out.printf("Enter a birth year of %dth person > ", i+1);
      int birth_year = s.nextInt();
      if(birth_year>2021) break;
      age[i] = 2021 - birth_year + 1;
      if(age[i] >= 60)
         count_old++;
      else if(age[i] >= 30)
        count_adult++;
      else if(age[i] >= 20)
        count_young++;
      else if(age[i] >= 13)
        count_youth++;
      else if(age[i] >= 7)
        count_child++;
      else
        count_baby++;
      count_person++;
    }
    System.out.println();
     for(int i=0; i<count_person; i++) {
      System.out.printf("%dth person are %d years old.\n", i+1, age[i]);
    }
    System.out.println();
     System.out.println("There are "+count_baby+" babys.");
    System.out.println("There are "+count_child+" childs.");
    System.out.println("There are "+count_youth+" youths.");
    System.out.println("There are "+count_young+" youngs.");
    System.out.println("There are "+count_adult+" adults.");
    System.out.println("There are "+count_old+" olds.");    
   }
}