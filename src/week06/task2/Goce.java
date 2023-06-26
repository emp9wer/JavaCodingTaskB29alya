package week06.task2;

import java.util.Scanner;

public class Goce {

    //Write a method that can find the maximum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

    /**
     * finds the maximum number from an int array
     * @param x
     * @return int
     */
    public static int maxNum(int[] x) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you'd like to be checked: ");
        int arrLength = input.nextInt();
        System.out.println("Please enter " + arrLength + " numbers: ");

        int[] nums = new int[arrLength];
        for (int i = 0; i < nums.length; i++) {
            nums[i] += input.nextInt();
        }

        System.out.println("Maximum number of the numbers you've entered is: ");
        System.out.println(maxNum(nums));

    }
}
