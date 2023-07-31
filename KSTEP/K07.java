package KSTEP;

 import java.util.Scanner;
 import java.util.ArrayList;

class Main {

    Scanner key = new Scanner(System.in);
    ArrayList<Student> arr = new ArrayList<Student>();

    public static void main(String[] args) {
        Main stepK = new Main();
        stepK.k07();
    }

    void k07() {
      int sNum; // 학생 수
      System.out.print("Enter a number of students > ");
      sNum = key.nextInt();
      for(int i=0 ; i<sNum ; i++) {
        System.out.print("Enter score of korean, english, math of " + (i+1) + "th student > ");
        input();
      }
      System.out.println("================================================");
      System.out.println("Registered " + sNum + " students list are as follows");
      System.out.println("------------------------------------------------");
      System.out.println("num     Korean  English Math    Total   Average Grade");
      for(int i=0 ; i<sNum ; i++)
        print(i);
	  }

    // 입력받는 메소드
    public void input() {
      int korean = key.nextInt();
      int english = key.nextInt();
      int math = key.nextInt();
      Student student = new Student(korean, english, math);
      arr.add(student);
    }

    // 출력하는 메소드
    public void print(int index) {
      int korean = arr.get(index).getKorean();
      int english = arr.get(index).getEnglish();
      int math = arr.get(index).getMath();
      int sum = korean + english + math;
      double ave = (double)sum/3;
      String grade;

      if(ave >= 95)
        grade = "A+";
      else if(ave>=90 && ave<95)
        grade = "A";
      else if(ave>=85 && ave<90)
        grade = "B+";
      else if(ave>=80 && ave<85)
        grade = "B";
      else if(ave>=75 && ave<80)
        grade = "C+";
      else if(ave>=70 && ave<75)
        grade = "C";
      else if(ave>=65 && ave<70)
        grade = "D+";
      else if(ave>=60 && ave<65)
        grade = "D";
      else
        grade = "F";

      System.out.printf("%d", index+1);
      System.out.printf("%9d", korean);
      System.out.printf("%8d", english);
      System.out.printf("%8d", math);
      System.out.printf("%9d", sum);
      System.out.printf("%9.1f", ave);
      if(grade.length() > 1)
        System.out.printf("%6s", grade);
      else
        System.out.printf("%5s", grade);
      System.out.println();
    }

    class Student {
      private int korean;
      private int english;
      private int math;

      public Student(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
      }

      public int getKorean() {
        return korean;
      }

      public int getEnglish() {
        return english;
      }

      public int getMath() {
        return math;
      }
    }
}