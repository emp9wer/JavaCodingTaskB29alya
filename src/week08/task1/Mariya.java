package week08.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mariya {
/*
Array - N unique integers that sum up to 0
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */

    public static void main(String[] args) {
        //optional user input for n number and quantity of arrays
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        System.out.println("Enter number of desire arrays");
        int arrNumber = input.nextInt();
        if (arrNumber < 1) System.out.println("must be positive number");
        if (n < 0 || n > 100) {
            throw new ArithmeticException("n must be between 1 and 100");
        }

        for (int j = 0; j <arrNumber ; j++) { //doing loop to create asked amount of arrays
            System.out.println(Arrays.toString(uniqueSum(n)));
        }


    }

    /**
     * method to create an array with unique numbers given length
     * @param n
     * @return
     */
    public static int[] uniqueSum(int n) {
        Random random = new Random();
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {

            if (i % 2 == 0) {
                arr[i] = random.nextInt(100);
            } else {
                arr[i] = -random.nextInt(100);
            }
            sum += arr[i];
        }
        /*
        another way to make sure numbers are unique-using indexes
        for(int i=0; i<n-1; i++){
        arr[i]=i;}
         */
        arr[n - 1] = sum * (-1); //last number in arrays used to make sure sum is 0

        return arr;
    }
}
