package week05.task2;

import java.util.Scanner;

public class Goce {

    /*
    Write a function that can reverse a String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse(String str){
        //char[] str2 = str.toCharArray();
        String[] str2 = str.split("");
        String result ="";
        for (int i=str2.length-1; i >= 0 ; i--) {
            result += str2[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String in = input.nextLine();
        System.out.println("The reverse version of your text is: ");
        System.out.println(reverse(in));
    }
}
