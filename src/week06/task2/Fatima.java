package week06.task2;

public class Fatima {
    public static int findMaxNum(int[] arr) {
        int max = arr[0]; // Assume the first element as the maximum

        for (int i = 1; i < arr.length; i++) { //  iterates over the remaining elements of the array, comparing each element with the current maximum value (max). If an element is found to be greater than the current maximum, it updates the max variable with the new maximum value.
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int maximumNumber = findMaxNum(arr);
        System.out.println("The maximum number in the array is: " + maximumNumber);
    }
}
