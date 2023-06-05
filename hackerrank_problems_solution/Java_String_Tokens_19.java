import java.util.Scanner;

public class Java_String_Tokens_19 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
         Scanner input = new Scanner(System.in);
         String S = input.nextLine();
         input.close();
         String[] tokens = S.split("[^a-zA-Z]");
         int numTokens = 0;
        
         for (int i=0; i<tokens.length; ++i) 
             if (tokens[i].length() > 0) 
                 numTokens++;
             
         System.out.println(numTokens);
        
         for (int i=0; i<tokens.length;++i)
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
    }
}
