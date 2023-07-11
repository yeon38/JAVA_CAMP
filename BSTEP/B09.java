import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b09();
  }
  void b09(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter height(cm) ");
    int height = s.nextInt();
    System.out.print("Enter weight(kg) ");
    int weight = s.nextInt();
    int bmi =(int)(weight/(height*0.01*height*0.01));
    if(bmi>=25){
      System.out.print("You are obesity");
    }
    else{
      System.out.print("You are not obesity");
    }
  }
}