package week04.task2;

import java.util.Arrays;

public class Lea {

    //Write a return method that checks if a string is built out of the same letters as another string.

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "acb";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}