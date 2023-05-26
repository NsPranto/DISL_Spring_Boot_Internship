package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_If_Else_3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
        
        int N=scanner.nextInt();

        if (N%2!=0) {
            System.out.println("Weird");
        }
        else if(N%2==0 && 2<N && N<=5) {
           System.out.println("Not Weird"); 
        }
        else if(N%2==0 && 6<N && N<=20) {
            System.out.println("Weird");
        }
        else if(N%2==0 && N>20) {
            System.out.println("Not Weird");
        }

    }
}
