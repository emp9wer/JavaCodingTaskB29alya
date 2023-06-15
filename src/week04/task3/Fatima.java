package week04.task3;

import java.util.LinkedHashSet;

public class Fatima {
    public static String removeDuplication (String input) {

        // Create a LinkedHashSet to preserve the order of characters
        LinkedHashSet<Character> uniqueChars  = new LinkedHashSet<>();

        // Iterate through each character in the input string

        // On each iteration, it retrieves the character at the current index using input.charAt(i).

        //The retrieved character is added to the uniqueChars set using the add method. Since a LinkedHashSet does not allow duplicate elements, only the unique characters will be stored.

        for (int i = 0; i < input.length(); i++) {

            uniqueChars.add(input.charAt(i));
        }

        StringBuilder result = new StringBuilder(); // created to build the resulting string.

        // This loop ensures that the characters are appended to the result string in the order they were encountered.

        for (Character c : uniqueChars) {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        System.out.println(removeDuplication(input)); // Output: ABC
    }
    }





/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */