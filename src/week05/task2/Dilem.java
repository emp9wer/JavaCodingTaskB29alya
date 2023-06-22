package week05.task2;

import java.util.Scanner;

public class Dilem {
    /**
     * Write a function that can reverse a String
     * Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String StrReverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            //reverse += str.toCharArray()[i];

            reverse += str.charAt(i);
        }
        return reverse;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word ");
        String word = input.nextLine();
        System.out.println("Result of reversed: " + StrReverse(word));
    }
}
