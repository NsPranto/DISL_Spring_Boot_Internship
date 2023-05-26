package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II_4 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
        Scanner scanner=new Scanner(System.in);

        int i=scanner.nextInt();
        Double d=scanner.nextDouble();
        scanner.nextLine();
        String s=scanner.nextLine();
        scanner.close();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}
