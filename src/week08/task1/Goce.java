package week08.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Goce {
    //Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    //The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).

    /**
     * Method accepts int argument between 2 and 99 as an array length, and returns a summation of all elements in an array as 0.
     *
     * @param x
     * @return
     */
    public static int[] sumUpToZero(int x) {

        if (x <= 1 || x >= 100) {
            throw new ArithmeticException("Length of the array must be bigger than 1 and smaller than 100");
        }

        Random randomNum = new Random();

        int[] arr = new int[x];// sets the parameter input as the array's length.
        int sum = 0;

        for (int i = 0; i < x - 1; i++) {// loops through the array.
            do {// creating a do/while loop to isolate the adding of elements from summarizing them.
                arr[i] = randomNum.nextInt();// adding random int elements into the array.
            } while (i > x - 1);// add random elements into the array until iteration is bigger than array's last index number. This will leave tha last array index unassigned.
            sum += arr[i];// sum element's values after each addition.
        }
        arr[arr.length - 1] = sum * (-1);// assigning the last index as opposite of the summation of previous indexes in order to ascertain the sum of all elements will be zero.
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero(5)));

    }
}








