package FSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f01();
    }
    void f01() {
      try (Scanner s = new Scanner(System.in)) {
        int[] num = new int[10]; 
        int first; // 첫 번째로 큰 수
        int second; // 두 번째로 큰 수
        int second_max_index = 0; // 두 번째로 큰 수의 인덱스
        //int newnum; // 숫자 입력을 위한 변수
        int i;
        for(i=0; i<10; i++){
          System.out.printf("Enter %dth number > ", i+1);
          num[i] = s.nextInt();
        }
        first = num[0];
        for(i=1; i<10; i++){
          if(num[i] > first) first = num[i];
        }
        second = 0;
        for(i=0; i<10; i++){
          if(num[i]>second && num[i] != first){
            second = num[i];
            second_max_index = i+1;
          }
        }
        System.out.printf("Second largest number is %dth number %d", second_max_index, second);
        
        s.close();
      }
	  }
      
}
