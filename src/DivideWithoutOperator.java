public class DivideWithoutOperator {
    /*

2️⃣

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

     */
    public static int divideWoOperator(int number ,int divisor){
     int res=0;

        if(divisor==0){
            System.err.println("divisor can not be 0");
            System.exit(1);
        }

        while (number>=divisor){
            number = number - divisor;
            res++;
        }
        return res;

    }

}
