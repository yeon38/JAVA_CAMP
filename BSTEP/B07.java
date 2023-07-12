import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b07();
  }
  void b07(){
    Scanner s =  new Scanner(System.in);
    System.out.print("Enter file size as megabytes > ");
    int megabytes = s.nextInt();
    long bytes = (long)megabytes*1024*1024;
    System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
    String usb2 = s.next();
    if(usb2.equals("N")){
      int time = (int)bytes/1500000;
      System.out.print("File transfer time is "+time);
    }
    else{
      int time = (int)bytes/60000000;
      System.out.print("File transfer time is "+time);
    }
    s.close();
  }
}