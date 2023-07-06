package week07.task1;

public class Anastasia {
    //Write a method that can find the minimum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    /**
     * Find min int in the Array
     * @param arr
     * @return
     */
    public static int MinNumber(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("The array is empty.");
        }

        int min = arr[0]; // Initialize the minimum as the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum if a smaller element is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int minimumNumber = MinNumber(arr);
        System.out.println("The minimum number is: " + minimumNumber);
    }
}
