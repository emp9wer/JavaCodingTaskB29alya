public class DivisionWithoutOperator {
    public static int divide(int dividend, int divisor) {
        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) != (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize quotient and remainder
        int quotient = 0;
        int remainder = dividend;

        // Subtract divisor from remainder until it becomes less than divisor
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        // Apply sign to the quotient
        if (negative) {
            quotient = -quotient;
        }

        return quotient;

    }
    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 4;
        int result = divide(dividend, divisor);
        System.out.println(result);
    }
}


