public class DivideWithoutOperator {
    /*

2️⃣

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

     */
    public static double divideWoOperator(int number, int divisor) {
        int res = 0;
        int sign =0;
        if (divisor == 0) { // check if number is 0 - we can not divide by 0
            throw new ArithmeticException("divisor can not be 0");
        }
        if (divisor > 0) { //if divisor is more than 0 ->
            while (number >= divisor) { // we count how many times we can subtract divisor from number
                number = number - divisor; // number decreases by value of divider each iteration
                res++; // write count of iterations in variable res
                sign=1; // since divisor is positive we use this variable to make result positive
            }

        } else {//if divisor is less than 0 ->
            divisor = Math.abs(divisor);// we use  Math.abs to get positive value to work with from divisor
            while (number >= divisor) {// we count how many times we can subtract divisor from number
                number = number - divisor;// number decreases by value of divider each iteration
                res++; // write count of iterations in variable res
                sign=-1;// since divisor is negative we use this variable to make result negative
            }

        }
        double decimalCount = 0; // we store decimal count in this double variable decimalCount
        if ( number!=0 ) { //if remainder != 0
            number = number * 100; //multiply remainder by 100
            while (number>=divisor){ //iterate while number >= divisor
                number-=divisor; // we subtract from remainder that was multiplied by 100 divisor
                decimalCount+=0.01; //and add to double variable decimalCount 0.01
            }
        }
        return (res+decimalCount) * sign; // we return result (we add whole count + decimal remainder and make it negative or positive.
    }
}

