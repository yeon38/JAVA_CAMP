package JSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j01();
    }
Scanner s = new Scanner(System.in);
    void j01() {
      
      int birth_year; // 입력받은 태어난 년도
        int[] age = new int[100]; // 각 사람들의 나이 (최대 100명)
        int count_person = 0; // 입력된 인원 수
        int count_baby = 0; // 유아 수
        int count_child = 0; // 어린이 수
        int count_youth=0; // 청소년 수
        int count_young=0; // 청년 수
        int count_adult=0; // 중년 수
        int count_old=0; // 노년 수
        int i ; // 반복문을 위한 변수
        int current;
        while(true){
            System.out.printf("Enter a birth year of %dth person > ", count_person+1);
            birth_year = s.nextInt();
            if(birth_year > 2021) break;
            current = AskAge(birth_year);
            if(current == 1) count_baby++;
            else if(current == 2) count_child++;
            else if(current == 3) count_youth++;
            else if(current == 4) count_young++;
            else if(current == 5) count_adult++;
            else count_old++;
            count_person++;
        }

        System.out.printf("There are %d babys.\n", count_baby);
        System.out.printf("There are %d childs.\n", count_child);
        System.out.printf("There are %d youths.\n", count_youth);
        System.out.printf("There are %d youngs.\n", count_young);
        System.out.printf("There are %d adults.\n", count_adult);
        System.out.printf("There are %d olds.", count_old);
   }
  int AskAge(int birthyear){
        int age;
        age = 2021-birthyear+1;
        System.out.printf("This person is %d years old.\n", age);
        if(age < 7){
            return 1;
        } else if(age < 13){
            return 2;
        } else if(age < 20){
            return 3;
        } else if(age < 30){
            return 4;
        } else if(age < 60){
            return 5;
        } else{
            return 6;
        }
    }
}