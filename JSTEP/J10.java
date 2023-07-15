package JSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepJ = new Main();
    stepJ.j10();
  }

  void j10() {
    // System.out.print(fibonacci(n));
    for(int i = 2; i<18; i++){
      System.out.printf("%dth ratio (%d / %d) : %.6f\n",i,fibonacci(i+1),fibonacci(i),(1.0*fibonacci(i+1)/fibonacci(i)));
    }
  }

  int fibonacci(int k){
    if (k <= 1)
			return k;
		else 
      return fibonacci(k-2) + fibonacci(k-1);
  
  }
}
