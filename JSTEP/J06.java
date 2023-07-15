package JSTEP;



class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j06();
    }

    void j06() {
      
      System.out.printf("Fibonacci numbers from 1 to 20 are as follows.\n");
      int n = 20;
      // System.out.print(fibonacci(n));
      for(int i = 1; i<n+1; i++){
        if(i==1) System.out.printf("%dst : %d\n",i,fibonacci(i));
        else if(i==2) System.out.printf("%dnd : %d\n",i,fibonacci(i));
        else if(i==3) System.out.printf("%drd : %d\n",i,fibonacci(i));
        else  System.out.printf("%dth : %d\n",i,fibonacci(i));
      }
	  }

  int fibonacci(int k){
    if (k <= 1)
			return k;
		else 
      return fibonacci(k-2) + fibonacci(k-1);
  
  }

}