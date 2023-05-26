package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Output_Formatting_5 {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String S=sc.next();
            int I=sc.nextInt();
            System.out.printf("%-15s%03d\n",S,I);
        }
        System.out.println("================================");
        sc.close();
    }
}
