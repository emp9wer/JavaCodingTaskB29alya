package week05.task1;

import java.util.Scanner;

public class Mariya {
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */

    public static String unique1(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {//verifying if the index of character is the only index in the string
                unique += each;
            }

        }
        return unique;
    }
    public static String unique2(String str){
        String unique = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // first character
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str
                if(str.charAt(i) == ch ){ //if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }

            if(frequency == 1){ // if the frequency is one, then it's unique
                unique += ch;
            }

        }
        return unique;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please write your string:");
        String original = in.next();
        System.out.println("Result of unique elements of the string : "+unique1(original));
        System.out.println("Result of unique elements of the string : "+unique2(original));
    }
}
