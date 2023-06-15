package week03.task1;

import java.util.Scanner;

public class Dilem {
    /*
    Numbers -- Prime Number
Write a method that can check if a number is prime or not.
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime number or not: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    public static  boolean isPrime(int num)
    {
        if(num<=1) //check if the number is less than or equal to 1. If it is, return false because prime numbers are greater than 1.j
        {
            return false;
        }

        // Check if the number is divisible by any integer from 2 to its square root
        for(int i=2;i<=num;i++)
        {
            if((num%i)==0)
                return  false; // If the number is divisible, it is not prime
        }
        return true; // If the number is not divisible by any integer, it is prime
    }


}

