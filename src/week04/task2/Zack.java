package week04.task2;

import java.util.Arrays;
import java.util.TreeSet;

public class Zack {
    /*
    ============  String - Same letters ================================
    -Write a return method that checks if a string is built out of the same letters as
    another string (in other words, they are Anagram or not)
          Ex: same("abc", "cab"); ==> true
              same("abc", "abb"); ==> false
     */
    public static void main(String[] args) {
        System.out.println("isAnagram_1(\"listen\", \"silent\") = " + isAnagram_1("listen", "silent"));
        System.out.println("isAnagram_2(\"abc\", \"cba\") = " + isAnagram_2("abc", "cba"));
    }

    // ============= SOLUTION 1 =============================

    /**
     * checks if the given string are Anagram or not
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isAnagram_1(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";
        for (char each : ch1)
            a1 += each;

        for (char each : ch2)
            a2 += each;

        return a1.equals(a2);
    }

    // ============= SOLUTION 2 =============================
    /**
     * checks if the given string are Anagram or not
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isAnagram_2(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);

    }



}