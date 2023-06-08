package week03.task1;

import java.util.Scanner;

public class Goce {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = input.nextInt();

        if (!primeNumber(x)) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is a not prime number");
        }

    }

    /**
     * Checks if a number is prime number and returns boolean
     * @param n
     * @return
     */
    public static boolean primeNumber(int n) {

        if (n <= 1) throw new ArithmeticException("Number you inserted must be a positive number and above 1.");

        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */

