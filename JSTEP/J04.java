package JSTEP;

import java.util.Scanner;

class Main {
  Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    Main stepJ = new Main();
    stepJ.j04();
  }

  void j04() {
    int m, d;
    int interval;
    System.out.print("Enter first day (month day) > ");
    m = s.nextInt();
    d = s.nextInt();

    interval = CalcDate(m, d);
    if (interval < 0) {
      System.out.print("Invalid input!");
    } else {
      System.out.printf("The interval between two dates is %d days.", interval);
    }
  }

  int CalcDate(int month, int day) {
    int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int m, d;
    int total = 0;
    int i;
    System.out.print("Enter second day (month day) > ");
    m = s.nextInt();
    d = s.nextInt();
    if (d > monthdays[m - 1] || month > 12 || m > 12 || day > monthdays[month - 1]) {
      return -1;
    } else if (m > month) {
      for (i = month - 1; i < m - 1; i++) {
        total += monthdays[i];
      }
      total += d;
      total -= day;
    } else {
      for (i = m - 1; i < month - 1; i++) {
        total += monthdays[i];
      }
      total += day;
      total -= d;
    }

    return total;
  }
}