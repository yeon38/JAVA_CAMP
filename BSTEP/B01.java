import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b01();
  }
  void b01(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a birth year > ");
    int birth_year = s.nextInt();
    int age = 2022-birth_year +1;
    if(age<20){
      System.out.print("You are not adult");
    }
    else{
      System.out.print("You are adult");
    }
    s.close();
  }
}

