import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker_20
{
   public static void main(String[] args){
    //https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        in.close(); 

        for (int i = 0; i < n; i++) {
            String regex = in.nextLine();

            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }    
   }
}
