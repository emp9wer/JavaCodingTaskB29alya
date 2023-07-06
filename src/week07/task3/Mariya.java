package week07.task3;

import java.util.Arrays;

public class Mariya {
    /*
    Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
     */

    /**
     * method to sort array in Descending order
     * @param arr
     * @return
     */
    public static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {//checking if next element is bigger, then swapping their places
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }
}
