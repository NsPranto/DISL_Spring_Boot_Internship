package hackerrank_problems_solution;

import java.util.*;

public class Java_PrimalityTest_25
{
    public static void main(String[] args)

    //https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
    {
        try (Scanner scanner = new Scanner(System.in);)
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}