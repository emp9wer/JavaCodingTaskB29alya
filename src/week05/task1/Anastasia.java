package week05.task1;

import java.util.ArrayList;
import java.util.List;

public class Anastasia {
   // Write a return method that can find the unique characters from the String
   public static char[] findUniqueCharacters(String input) {
       //we use an ArrayList called uniqueCharsList to store the unique characters found in the input string.
       List<Character> uniqueCharsList = new ArrayList<>();

       //We iterate through the loop and check if character is already present in the list. If it's not, we add it to the list.
       for (int i = 0; i < input.length(); i++) {
           char currentChar = input.charAt(i);
           if (!uniqueCharsList.contains(currentChar)) {
               uniqueCharsList.add(currentChar);
           }
       }

       //we convert the uniqueCharsList into an array called uniqueCharsArray.
                                          //toArray() method
       char[] uniqueCharsArray = new char[uniqueCharsList.size()];
       for (int i = 0; i < uniqueCharsList.size(); i++) {
           uniqueCharsArray[i] = uniqueCharsList.get(i);
       }
       //return the array of unique characters.
       return uniqueCharsArray;
   }

    public static void main(String[] args) {
        String input = "Hello, Little Mommy Doggy";
        char[] uniqueChars = findUniqueCharacters(input);
        for (char ch : uniqueChars) {
            System.out.print(ch);
        }
    }
}
