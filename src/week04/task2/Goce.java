package week04.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Goce {
/*
    Write a return method that checks if a string is built out of the same letters as another string.
        Ex: same("abc", "cab"); ==> true
            same("abc", "abb"); ==> false
     */

    //First way, using iteration:
    /*
    public static boolean same1(String str1, String str2) {

        //First version:
        String test = "";
        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str1.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                    test += ""+ str2.charAt(j);
                }
            }
        }
        return test.equals(str1);
    }

     */

    //Second way, using Arrays utility class ( sort() method )
    public static boolean same2(String x, String y){
        char[] first = x.toCharArray();
        char[] second = y.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two texts: ");
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        System.out.println("The result whether both text have same characters is: ");
        //System.out.println(same1(text1, text2));
        System.out.println(same2(text1, text2));

    }
}
