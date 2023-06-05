package hackerrank_problems_solution;

import java.util.*;

public class Java_Subarray_30 {

    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = j; k < n; k++) {
                sum = array1[k] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
