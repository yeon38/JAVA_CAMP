package HSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h06();
    }

    void h06() {
      Scanner s = new Scanner(System.in);
      
      int number[] = new int[5];
      System.out.print("Enter 6 numbers from 2 to 9 > ");
      for(int i=0; i<5; i++){
        number[i] = s.nextInt();
      }

      int pow_value[][] = new int[5][5];
      int min = (int)Math.pow(9, 9);
      int max=0;
      int max_a=0, max_b=0;
      int min_a=0, min_b=0;
      
      for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
          pow_value[i][j] = (int)Math.pow(number[i], number[j]);
          
          if(number[i] != number[j]){            
            if(pow_value[i][j] > max){
              max = pow_value[i][j];
              max_a = number[i];
              max_b = number[j];
            }
            else if(pow_value[i][j] < min){
              min = pow_value[i][j];
              min_a = number[i];
              min_b = number[j];
            }
          }
        }
      }

      for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
          pow_value[j][i] = (int)Math.pow(number[j], number[i]);
          
          if(number[j] != number[i]){            
            if(pow_value[j][i] > max){
              max = pow_value[j][i];
              max_a = number[j];
              max_b = number[i];
            }
            else if(pow_value[j][i] < min){
              min = pow_value[j][i];
              min_a = number[j];
              min_b = number[i];
            }
          }
        }
      }

      System.out.printf("Max number is %d which is %d squared of %d\n", max, max_b, max_a);
      System.out.printf("Min number is %d which is %d squared of %d\n", min, min_b, min_a);

      
   }
}