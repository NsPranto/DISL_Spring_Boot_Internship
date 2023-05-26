package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_End_of_file_9 {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (sc.hasNextLine()) {
            System.out.println(n + " " + sc.nextLine());
            n++;
        }
        sc.close();
    }
}
