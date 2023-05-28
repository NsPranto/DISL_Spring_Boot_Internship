import java.util.*;

public class Java_String_Reverse_17 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );      
    }
}