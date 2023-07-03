package week07.task2;

import java.util.Arrays;

public class Kirill {
    //2️⃣  Array_SortAscending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

    /**
     * sort an int array in Ascending order
     * @param arr
     * @return int[]
     */
    public static int[] sortAscending(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int outerLoop = 0; outerLoop < arr.length; outerLoop++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int innerLoop = 0; innerLoop < arr.length; innerLoop++) {
                if (arr[innerLoop] < min) {
                    min = arr[innerLoop];
                    minIndex = innerLoop;
                }
            }
            sorted[outerLoop] = min;
            arr[minIndex] = Integer.MAX_VALUE;
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));
    }
}
