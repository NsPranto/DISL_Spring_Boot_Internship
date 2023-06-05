package hackerrank_problems_solution;

import java.util.*;

public class Java_Hashset_36 {

 public static void main(String[] args) {
    //https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

HashSet<String> pairs = new HashSet<String>(t);

    for(int i = 0; i < t; i++)
    {
        pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
        System.out.println(pairs.size());        
    }

    }
}