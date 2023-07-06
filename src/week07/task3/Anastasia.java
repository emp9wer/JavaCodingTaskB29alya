package week07.task3;

public class Anastasia {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    /**
     * Sorting Array in descending order
     */

    public static int[] sortDescending(int[] arr) {
        if (arr.length <= 1) {
            return arr; // If the array has 0 or 1 element, it is already sorted
        }


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] sortedArray = sortDescending(arr);

        System.out.print("Sorted array in descending order: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}







