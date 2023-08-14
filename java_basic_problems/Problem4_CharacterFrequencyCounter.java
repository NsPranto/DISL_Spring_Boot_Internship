package java_basic_problems;

import java.util.*;

public class Problem4_CharacterFrequencyCounter {
    public static void main(String[] args) {
        String input = "dhrubok infotech";
        
        Map<Character, Integer> charFrequencyMap = new TreeMap<>();
        
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
