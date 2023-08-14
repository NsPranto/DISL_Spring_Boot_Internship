package java_basic_problems;

import java.util.Scanner;

public class Problem1_FactorialOfN {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n, factorial = 1;
      System.out.print("Enter any positive integr: ");
      n = input.nextInt();
      input.close();

      for (int i = n; i >= 1; i--) {
         factorial = factorial * i;
         System.out.print(i + "x");
      }
      System.out.println("\n");
      System.out.println("Factorial of " + n + " = " + factorial);
   }
}
