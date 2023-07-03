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
        int min = Integer.MAX_VALUE; // Variable 'min' is a temporary minimum number variable where every number in the array will be compared against this. Temporarily the maximum number value in Java is assigned to it.
        for (int i = 0; i < in.length; i++) {
            if (in[i] < min) {// Always true because every number in the array will be smaller than the maximum number value that is in Java. Variable 'min' wil be reassigned with every array number in turn and compared with the next number in the same array.
                min = in[i];//Every number in the array will be assigned in the 'min' variable. Will end up with the minimum value.
            }
        }
        return min;

    }

    static int[] in;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        in = new int[input.nextInt()];// defining the size of an array by inputting it with Scanner.
        System.out.println("Please enter the numbers to be added in the array: ");
        for (int i = 0; i < in.length; i++) {
            in[i] = input.nextInt();// Entering the numbers in the array through loop
        }

        System.out.println("Minimum number of the array you've entered is: " + minNum());

    }
}
