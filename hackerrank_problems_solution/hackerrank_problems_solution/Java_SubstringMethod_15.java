package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_SubstringMethod_15 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
