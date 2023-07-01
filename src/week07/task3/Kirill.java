package week07.task3;

import java.util.Arrays;

public class Kirill {
    //3️⃣ Array_SortDescending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};

    /**
     * sort an int array in Descending order
     * @param arr
     * @return int[]
     */
    public static int[] sortDescending(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int outerLoop = 0; outerLoop < arr.length; outerLoop++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int innerLoop = 0; innerLoop < arr.length; innerLoop++) {
                if (arr[innerLoop] > max) {
                    max = arr[innerLoop];
                    maxIndex = innerLoop;
                }
            }
            sorted[outerLoop] = max;
            arr[maxIndex] = Integer.MIN_VALUE;
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("sortDescending(arr) = " + Arrays.toString(sortDescending(arr)));
    }
}
