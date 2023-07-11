import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b04();
  }
  void b04(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter area of Apartment(m^2) > ");
    double m2_area = s.nextDouble(); 
    double pyung_area = m2_area/3.305;
    System.out.printf("Area of Apartment(평수) %.1f\n", pyung_area);
    if(pyung_area<30){
      System.out.print("It is small apartment");
    }
    else{
      System.out.print("It is big apartment");
    }
    
  }
}
