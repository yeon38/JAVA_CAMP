package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c07();
  }
  void c07(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter file size as megabytes > ");
    int megabytes = s.nextInt();
    long bytes = (long)megabytes*1024*1024;
    System.out.print("Enter transfer method (1. WiFi, 2. Bluetooth, 3. LTE, 4. USB) > ");
    byte kind = s.nextByte();
    
    if(kind == 1){
      double time =(double)bytes/1500000.0;
      System.out.printf("File transfer time is %.1f",time);
    }
    else if(kind == 2){
      double time =(double)bytes/300000.0;
      System.out.printf("File transfer time is %.1f",time);
    }
    else if(kind == 3){
      double time =(double)bytes/1000000.0;
      System.out.printf("File transfer time is %.1f",time);
    }
    else{
      double time =(double)bytes/60000000.0;
      System.out.printf("File transfer time is %.1f",time);
    }
    
  }
}
