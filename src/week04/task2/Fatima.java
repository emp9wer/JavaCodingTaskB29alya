package week04.task2;
import java.util.HashMap;
import java.util.Map;

public class Fatima {
    public static boolean isSame  (String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Create frequency maps for the characters in both strings
        Map<Character, Integer> frequencyMap1 = buildFrequencyMap (str1);
        Map<Character, Integer> frequencyMap2 = buildFrequencyMap(str2);

        // Compare the frequency maps
        return frequencyMap1.equals(frequencyMap2);
    }
    private static Map<Character, Integer> buildFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(isSame(str1, str2)); // Output: true

        String str3 = "abc";
        String str4 = "abb";
        System.out.println(isSame(str3, str4)); // Output: false
    }
}






    /*
    Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */