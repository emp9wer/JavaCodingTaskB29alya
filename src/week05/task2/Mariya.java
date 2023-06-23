package week05.task2;

import java.util.Scanner;

public class Mariya {
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA

 */

    /**
     * Method reversing order of chars in a given string
     * @param str
     * @return
     */
    public static String reverse(String str){
        String reverse = "";  // to contain all the characters of the given string in reversed order

        for(int i = str.length() - 1 ; i >= 0; i-- ){ // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }

        return reverse;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please write your string:");
        String original = in.nextLine();
        System.out.println("Result of reversed string : "+reverse(original));

    }

}

