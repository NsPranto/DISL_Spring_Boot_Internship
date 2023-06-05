import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker_20
{
   public static void main(String[] args){
    //https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
    //https://www.youtube.com/watch?v=a46eKP6mL1A
       
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      in.close();
      while(testCases>0){
         String pattern = in.nextLine();
          try{
              Pattern.compile(pattern);
              System.out.println("Valid");
          }catch(Exception e){
              System.out.println("Invalid");
          }
          testCases--;
      }
   }
}
