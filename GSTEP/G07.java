package GSTEP;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g07();
    }

    void g07() {
      Scanner s = new Scanner(System.in);
      int team_count; // 방문한 팀수
      int[] charge = {5000, 10000, 15000, 3000};// 연령별 수
      int[] count = new int[4]; // 입력받은 연령별 인원 수
      int[] v_count = {0, 0, 0, 0}; // 연령별 방문자 합계
      int total_count = 0; // 총 방문자 수
      int sum; // 팀별 계산한 요금
      int total_sum =0; // 총 요금
      int membership = 0; // 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)
      int i, j; // 반복문을 위한 변수

      System.out.print("Enter number of team >");
      team_count = s.nextInt();
      System.out.printf("\n\n");
      
      for(i=0; i<team_count; i++){
        sum=0;
        // number of team member
        System.out.printf("Enter a number of %d th team member (child, youth, adult, old) > ", i+1);
        // 4 개 입력
        for(j=0; j<4; j++){
          count[j] = s.nextInt();
          v_count[j] += count[j]; // age visitor
          total_count += count[j]; // total visitor
          sum += count[j] * charge[j];
        }
        // Discount
        System.out.printf("Enter a discount membership type of %d th team (no membership:0 , normal:1 , VIP:2) > ", i+1);
        membership = s.nextInt();

        if(membership == 1) sum -= sum*(0.1);
        else if(membership == 2) sum -= sum*(0.2);
        System.out.printf("Admission fees of %dth team is %d\n", i+1, sum);
        total_sum += sum;
        System.out.printf("\n");
      }

      System.out.printf("Total number of visitors %d\n", total_count);
      System.out.printf("Total number of child %d\n", v_count[0]);
      System.out.printf("Total number of youth %d\n", v_count[1]);
      System.out.printf("Total number of adult %d\n", v_count[2]);
      System.out.printf("Total number of old %d\n", v_count[3]);
      System.out.printf("\nTotal free is %d", total_sum);
	}
}