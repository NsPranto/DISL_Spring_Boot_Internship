package java_basic_problems;

public class Problem3_MinimumAndSecondMinimum {
    public static void main(String[] args) {
        int[] inputArray = {8, 5, 7, 9, 6, 5, 4, 1, 2, 8, 9, 6, 4, 7};
        
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int num : inputArray) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        
        System.out.println("Minimum Number: " + min);
        System.out.println("Second Minimum Number: " + secondMin);
    }
}
