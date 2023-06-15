package week03.task2;

public class Fatima {
    public static void main(String[] args) {
        int number = -38;
        int reversedNumber = reverseDigits(number);
        System.out.println( " The reverse of " + number + " is : " + reversedNumber);
    }
    public static int reverseDigits(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // Convert to positive number for reversal
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }
}

/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -38  output: -83
 */









//declaring a boolean variable isNegative and assigns it the value true if number is less than 0 (indicating a negative number).

//If number is negative, the number variable is negated by multiplying it by -1, effectively converting it to a positive number.

//In the context of reversing the digits of a number, the modulus operator % is commonly used to extract the last digit
//By taking the number modulo 10 (number % 10), you obtain the remainder of the division by 10, which corresponds to the last digit of the number.

// To reverse the digits, you need to extract the last digit and place it as the first digit in the reversed number. By dividing the number by 10 (number / 10), you effectively remove the last digit from the number.

// For example, let's say you have the number 123. By taking 123 % 10, you get 3, which is the last digit. Then, by dividing 123 by 10 (123 / 10), you get 12, which is the remaining digits.

//By repeatedly applying this process in a loop, you can extract the last digit and add it to the reversed number, while progressively reducing the original number by removing the last digit.

//Therefore, using the modulo operator (%) and division by 10 (/ 10) is a common approach to reverse the digits of a number in Java. It allows you to extract and manipulate the individual digits in a systematic manner.