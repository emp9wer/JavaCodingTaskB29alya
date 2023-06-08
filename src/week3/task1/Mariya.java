package week3.task1;

import java.util.Scanner;

public class Mariya {

    /*
    Numbers -- Prime Number
Write a method that can check if a number is prime or not.
     */
public static boolean isPrimeNumber(int num){
    if(num<=1)return false; //negative numbers and 1 are not prime

    for (int i = 2; i < num ; i++) {
        if(num%i==0)return false;//if number equally divisible by any other number , it is not prime

    }
    return true;
}


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = input.nextInt();
        System.out.println(isPrimeNumber(num));

    }

}
