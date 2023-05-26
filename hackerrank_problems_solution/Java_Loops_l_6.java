package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Loops_l_6 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
        Scanner sc=new Scanner(System.in);
        int number, multiplication=1;
        number=sc.nextInt();
        for (int i = 1; i <=10; i++) {
            multiplication=number*i;
            System.out.println(number+" x "+i+" = "+multiplication);
        }
        sc.close();
    }
}
