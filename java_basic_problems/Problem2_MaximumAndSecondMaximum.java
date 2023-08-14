package java_basic_problems;

public class Problem2_MaximumAndSecondMaximum {
    public static void main(String[] args) {
        int[] inputArray = {8, 5, 7, 9, 6, 5, 4, 1, 2, 8, 9, 6, 4, 7};
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : inputArray) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        System.out.println("Maximum Number: " + max);
        System.out.println("Second Maximum Number: " + secondMax);
    }
}
