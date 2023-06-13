package week04.task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mariya {
    /*
    Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC

     */

    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please write your string:");
        String original = in.next();
        System.out.println("Without duplicates : "+ removeDup(original));
    }

}
