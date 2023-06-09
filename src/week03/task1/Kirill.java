package week03.task1;

public class Kirill {
    /*
1️⃣
Numbers -- Prime Number
Write a method that can check if a number is prime or not.
     */


    /**
     * checks if the number is prime
     * @param num
     * @return
     */
    public static boolean isPrime(int num){
        if(num<=1) // check if number is less of == 1
        {
            return false;
        }
        for(int i=2;i<=num/2;i++) //check if number is prime ()
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));
        System.out.println(isPrime(10));
        System.out.println(isPrime(11));
        System.out.println(isPrime(12));

    }






}
