import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a06();
  }
  void a06(){
    Scanner s =  new Scanner(System.in);
    System.out.print("Enter file size as gigabytes > " );
    int gigabytes= s.nextInt();
    int megabytes=gigabytes*1024;
    int kilobytes=megabytes*1024; 
    long bytes=(long)kilobytes*1024;
    System.out.println("Your file size is");
    System.out.println(megabytes+" MB");
    System.out.println(kilobytes+" KB");
    System.out.println(bytes+" B");
    s.close();
  }
}
