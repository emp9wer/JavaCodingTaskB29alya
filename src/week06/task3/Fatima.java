package week06.task3;

public class Fatima {




    public static int digitSum (String str) {
        int sum = 0;

        //The method then iterates over each character in the string using a for loop. It checks if the current character is a digit using the Character.isDigit() method. If it is, the character is converted to its corresponding numeric value using Character.getNumericValue(), and the value is added to the sum variable.

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
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