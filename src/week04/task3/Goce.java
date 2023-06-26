package week04.task3;

import java.util.Scanner;

public class Goce {

    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDup(String str) {

        String result="";

        for (int i = 0; i < str.length(); i++) {// iterating through the given string
            if(!result.contains(""+str.charAt(i))){//  by looping/checking that the empty new string(result) doesn't contain the given string's characters, we assign a character from thr given string only once to the new string(result).
                result += ""+str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String in = input.nextLine();
        System.out.println("The characters present in your text are: ");
        System.out.println(removeDup(in));


    }
}
