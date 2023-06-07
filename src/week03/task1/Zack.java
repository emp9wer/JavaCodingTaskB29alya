package week03.task1;

public class Zack {
    /*
    ============== Numbers -- PrimeNumber ===============
    Write a method that can check if a number is prime or not
    Note: Prime numbers are the natural positive numbers that are greater than 1 and also
    divisible by only 1 and the number itself.
     */

    public static void main(String[] args) {
        System.out.println("primeNumber(32) = " + primeNumber(32));
        System.out.println("primeNumber(19) = " + primeNumber(19));
        System.out.println("primeNumber(882) = " + primeNumber(882));
    }

    /**
     * checks if a number is prime or not
     * @param num
     * @return
     */

    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }


}
