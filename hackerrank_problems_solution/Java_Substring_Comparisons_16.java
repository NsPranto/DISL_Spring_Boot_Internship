package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Substring_Comparisons_16 {

    public static String getSmallestAndLargest(String s, int k) {
        String S = "";
        String L = "";
        
        java.util.List<String> a = new java.util.ArrayList<>();

        for(int i=0;i<s.length()-k+1;i++){
                a.add(s.substring(i,i+k));   
        }
        java.util.Collections.sort(a);
         S = a.get(0);
         L = a.get(a.size()-1);
        return S + "\n" + L;
    }
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();     
        System.out.println(getSmallestAndLargest(s, k));
    }
}