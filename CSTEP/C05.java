package CSTEP;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c05();
  }
  void c05(){
    int day_count=0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a month > ");
    int month = s.nextInt();
    System.out.print("Enter a day > ");
    int day = s.nextInt();
    
    for(int i=1; i<=month; i++){
      if(day>31){
        System.out.print("This date is not valid.");
        break;
      }
      else{
        if(i==3||i==5||i==7||i==8||i==10||i==12){
          day_count +=31;
          
        }
        else if(i==1){
          day_count = day;
          
        }
        else if(i==2){
          day_count +=28;
          
        }
        else{
          day_count +=30;
          
        }
        
      }
      
    }
    
    System.out.print("This date is " +day_count+ "th of the year");
    
  }
}