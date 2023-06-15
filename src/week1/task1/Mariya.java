package week1.task1;

import java.util.Scanner;

/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
public class Mariya {

    public static String identify(int num){
        if (num%2==0) return "Even";
        else return "Odd";
    }

    public static void main(String[] args) {
        System.out.println("Please enter the number:");

        Scanner input = new Scanner(System.in);

        System.out.println(identify(input.nextInt()));
    }

}
