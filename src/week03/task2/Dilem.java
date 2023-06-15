package week03.task2;

public class Dilem {

    public static int reverseNegativeNumber(int number) {
        int reversedNumber = 0;
        boolean isNegative = number < 0;

        if (isNegative) {
            number *= -1; // Convert negative number to positive for reversal

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            reversedNumber *= -1; // Convert back to negative number
        } else {
            reversedNumber = number; // If the number is positive, return it as is
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = -38;
        int reversedNumber = reverseNegativeNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}


