package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Loops_II_7 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for(int j = 0; j < n; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
