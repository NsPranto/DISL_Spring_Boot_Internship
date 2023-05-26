package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Anagrams {
    public static void main(String[] args) {

    //https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String s1, String s2) {
        
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[(int) s1.charAt(i)] += 1;
                b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
