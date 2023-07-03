package week06.task2;
/*
Array_FindMaximum
        Write a method that can find the maximum number from an int Array
        Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
        */

public class Anastasia {
    public static int MaxNumber(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is empty.");
        }

        int maxNum = arr[0]; // Assume the first element is the maximum

        // Iterate through the array and update the maximum if a larger number is found
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int maxNumber = MaxNumber(arr);
        System.out.println("Maximum number: " + maxNumber);
    }
}
