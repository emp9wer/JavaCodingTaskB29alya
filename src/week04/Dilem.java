package week04;

import java.util.HashMap;
import java.util.Map;

public class Dilem {
    /**
     * Write a return method that can find the frequency of characters
     *   Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChars(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String frequency = frequencyOfChars(str);
        System.out.println(frequency);
    }
}

