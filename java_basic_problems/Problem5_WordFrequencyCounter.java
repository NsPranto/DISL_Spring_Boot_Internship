package java_basic_problems;

import java.util.*;

public class Problem5_WordFrequencyCounter {
    public static void main(String[] args) {
        String[] inputArray = {
            "apple banana", "apple orange banana", "banana orange", "apple"
        };
        
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>(); //key--> String Typed, Value--> Integer Typed
        
        for (String input : inputArray) {
            String[] words = input.split(" ");
            for (String word : words) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
