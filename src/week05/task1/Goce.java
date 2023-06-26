package week05.task1;

import java.util.*;


public class Goce {

    //String - Find the unique
    //Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String unique(String str) {

        char[] str2 = str.toCharArray();
       String result = "";
        for (char element : str2) {
            int frequency = 0;
            for (Character each : str2) {
                if (element == each) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                result += ""+element;
            }
        }
      return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string of characters: ");
        String in = input.nextLine();
        System.out.println("Updated string of unique characters is as follows: ");
        System.out.println(unique(in));


    }
}
