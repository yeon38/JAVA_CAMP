import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b03();
  }
  void b03(){
    Scanner s =  new Scanner(System.in);
    System.out.print("Enter width of Rectangle > ");
    int width = s.nextInt();
    System.out.println("Enter height of Rectangle > ");
    int height = s.nextInt();
    int area = width*height;
    if(height==width){
      System.out.println("Area of Rectangle is "+area+" and");
      System.out.println("it is square");
    }
    else{
      System.out.println("Area of Rectangle is "+area+" and");
      System.out.println("it is not square");
    }  
  }
}