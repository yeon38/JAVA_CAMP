package ISTEP;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i06();
    }

    void i06() {
      int big=0, normal=0, small=0;
      System.out.print("Generating 10 numbers\n");
      byte returnValue;
      for(int i=0; i<10; i++){
        returnValue = GetRandom();
        System.out.printf("Generated random number is %d\n", returnValue);

        if(returnValue >= 70) big++;
        else if(returnValue >= 40) normal++;
        else small++;
      }
      System.out.println();

      System.out.printf("1. Big (>= 70) : %d\n", big);
      System.out.printf("2. Normal (>= 40) : %d\n", normal);
      System.out.printf("3. Small (< 40) : %d\n", small);
	 }

  byte GetRandom(){
    byte[] arr = new byte[8];
    new Random().nextBytes(arr);
    return arr[0];
  }
}