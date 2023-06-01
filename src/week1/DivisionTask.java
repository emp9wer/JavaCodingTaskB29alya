package week1;

public class DivisionTask {
    public static double divide(double dividend, double divisor) {

        if (divisor == 0) {
            System.err.println("Exception: divisor cannot be zero");
            return 0;
        }

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient;

    }

    public static void main(String[] args) {
        double dividend = 13;
        double divisor = 5;
        double result = divide(dividend, divisor);
        double remainder = dividend - (result * divisor);
        System.out.println(dividend + " divided by " + divisor + " is " + result + " with a remainder of " + remainder);
    }
}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */

