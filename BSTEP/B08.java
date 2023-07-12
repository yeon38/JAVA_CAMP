import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b08();
  }
  void b08(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first number ");
    int num1 = s.nextInt();
    System.out.print("Enter second number ");
    int num2 = s.nextInt();
    System.out.print("Enter third number ");
    int num3 = s.nextInt();
    if(num1==num2 || num2==num3 || num1==num3){
      System.out.println("Satisfies the first condition");
    }
    if((num1>50&&num2>50) || (num2>50&&num3>50) || (num1>50&&num3>50)){
      System.out.println("Satisfies the second condition");
    }
    if(num1+num2==num3 || num2+num3==num1 || num1+num3==num2){
      System.out.println("Satisfies the third condition");
    }
    if(num1%num2==0 ||num2%num3==0 ||num3%num2==0||num2%num1==0 || num3%num1==1||num1%num3==0){
      System.out.println("Satisfies the fourth condition");
    }
    s.close();
  }
}