package hackerrank_problems_solution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Regex2_DuplicateWords_22 {

    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true
        //https://www.youtube.com/watch?v=OUT0SZ6j0TQ

        String regex = "(\\b\\w+)(\\s\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}