package week06.task3;

public class Fatima {

    public static int digitSum (String str) {
        int sum = 0; //an integer variable sum is initialized with a value of 0. This variable will be used to store the sum of all the digits in the input string.

        //The method then iterates over each character in the string using a for loop. It checks if the current character is a digit using the Character.isDigit() method. If it is, the character is converted to its corresponding numeric value using Character.getNumericValue(), and the value is added to the sum variable.

        for (int i = 0; i < str.length(); i++) { //If the character c is a digit, it is converted to an integer using the Character.getNumericValue() method, and the resulting integer is stored in the variable digit

            char c = str.charAt(i); // Inside the loop, the character at the current index i is obtained using the charAt method of the String class and assigned to the variable c.

            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit; // The value of digit is added to the sum variable using the += operator, updating the sum of digits.
            }
            //Once the loop finishes iterating through all the characters in the input string, the final value of sum is returned from the digitSum method.
        }

        return sum;
    }

    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        int sum = digitSum (input);
        System.out.println("Sum of digits: " + sum);
    }
}







/*
  Write a method that can return the sum of the digits in a String
    Ex:  "12 java 5 apple 3"  ==>  20
 */