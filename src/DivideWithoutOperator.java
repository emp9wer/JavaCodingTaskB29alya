public class DivideWithoutOperator {
    /*

2️⃣

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

     */
    public static int divideWoOperator(int number, int divisor) {
        int res = 0;

        if (divisor == 0) {
            throw new ArithmeticException("divisor can not be 0");
        }
        if (divisor > 0) {
            while (number >= divisor) {
                number = number - divisor;
                res++;
            }
            return res;
        } else {
            divisor = Math.abs(divisor);
            while (number >= divisor) {
                number = number - divisor;
                res++;

            }

        }
        return res * -1;
    }
}

