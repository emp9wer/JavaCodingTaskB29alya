package week03.task1;

public class Fatima {

    // FirstOfAll : A prime number is a natural number greater than 1 that cannot be divided evenly by any other numbers except for 1 and itself. In other words, a prime number is a number that has exactly two distinct positive divisors: 1 and the number itself.
    public static void main(String[] args) {

        int number =9;
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

    }

    public static boolean isPrime(int number) { // The method isPrime takes an integer number as an input and returns a boolean value indicating whether the number is prime or not.

        if (number <= 1) { // The first condition checks if the number is less than or equal to 1. Prime numbers, by definition, are greater than 1. So, if the number is less than or equal to 1, we return false because it cannot be prime.

            // If the number is greater than 1, the method proceeds to the next step.

            return false;

        }

        // use a loop to check for divisibility of the number from 2 to number - 1. The loop iterates through each value of i.

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {  //Inside the loop, we check if the number is divisible evenly by the current value of i. If number % i (remainder of the division) is equal to 0, it means number is divisible by i. In this case, we return false because it indicates that the number is not prime.



                return false;
            }
        }


        return true; // If the loop completes without finding any divisors, we conclude that the number is prime and return true.
    }
}


/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not
 */