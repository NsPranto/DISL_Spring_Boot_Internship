package hackerrank_problems_solution;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger_27 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
        Scanner sc = new Scanner(System.in);
        sc.close();
     BigInteger bi1 = new BigInteger(sc.next());
     BigInteger bi2 = new BigInteger(sc.next());

        BigInteger  bi3, bi4;
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println( bi3);
        System.out.println( bi4);
    }
}
