package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_I_2 {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
        
        Scanner scanner=new Scanner(System.in);
        int myInt1= scanner.nextInt();
        int myInt2= scanner.nextInt();
        int myInt3= scanner.nextInt();
        
        scanner.close();
        
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
        
        
        
    }
}
