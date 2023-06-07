import java.util.*;

public class Java_String_Reverse_17 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
        
        Scanner input=new Scanner(System.in);
        String reverse=input.next();
        input.close();
        System.out.println(reverse.equals(new StringBuilder(reverse).reverse().toString())?"Yes" : "No");      
    }
}