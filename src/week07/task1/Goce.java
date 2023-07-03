package week07.task1;

import java.util.Scanner;

/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
public class Goce {

    /**
     * Method returns minimum number of an array
     * @return
     */
    public static int minNum() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < in.length; i++) {
            if (in[i] < min) {
                min = in[i];
            }
        }
        return min;

    }

    static int[] in;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        in = new int[input.nextInt()];
        System.out.println("Please enter the numbers to be added in the array: ");
        for (int i = 0; i < in.length; i++) {
            in[i] = input.nextInt();
        }

        System.out.println("Minimum number of the array you've entered is: " + minNum());

    }
}
