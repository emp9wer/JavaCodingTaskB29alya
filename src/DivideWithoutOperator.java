public class DivideWithoutOperator {
    /*

2️⃣

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

     */
    public static double divideWoOperator(int number, int divisor) {
        int res = 0;
        int sign =0;
        if (divisor == 0) {
            throw new ArithmeticException("divisor can not be 0");
        }
        if (divisor > 0) {
            while (number >= divisor) {
                number = number - divisor;
                res++;
                sign=1;
            }

        } else {
            divisor = Math.abs(divisor);
            while (number >= divisor) {
                number = number - divisor;
                res++;
                sign=-1;
            }

        }
        double decimalCount = 0;
        if (number < divisor && number!=0) {
            number = number * 100;
            while (number>=divisor){
                number-=divisor;
                decimalCount+=0.01;
            }
        }
        return (res+decimalCount) * sign;
    }
}

