package week04.task2;

import java.util.Arrays;

public class Anastasia {
    //Write a return method that checks if a string is built out of the same letters as another string.

    public static boolean areTheSame(String str1, String str2) {
        // Remove spaces and convert to lowercase
        String processedStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String processedStr2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (processedStr1.length() != processedStr2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = processedStr1.toCharArray();
        char[] charArray2 = processedStr2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


     if (areTheSame(str1, str2)) {
        System.out.println(str1 + " and " + str2 + " are the same.");
    } else {
        System.out.println(str1 + " and " + str2 + " are not the same.");
    }
}
}
