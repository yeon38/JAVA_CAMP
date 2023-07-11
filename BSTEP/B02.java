import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b02();
  }
  void b02(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter temperature > ");
    double input_degree = s.nextDouble();
    System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
    String kind = s.next();
    
    if(kind.equals("C")){
      double output_degree = (input_degree * 1.8) +32;
      System.out.print("Fahrenheit temperature is "+output_degree);
    }
    else{
      double output_degree = (input_degree -32)/1.8;
      System.out.print("Celsius temperature is "+output_degree);
      
    }
    
  }
}
