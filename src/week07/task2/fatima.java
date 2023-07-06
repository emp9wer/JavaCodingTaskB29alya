package week07.task2;

public class fatima {


    /**
     * method that sort an int array in Ascending order without using the sort method of the Arrays class
     * @param array
     * @return
     */
    public static int[] SortArray(int[] array) {


        int n = array.length;

        // Compare the current element  with each element in the sorted part of the array, moving from right to left.
        //
        //If the current element is greater than the current element , shift it one position to the right.
        //Decrement j to move to the next element in the sorted part of the array.
        //Repeat this process until we  find an element smaller than or equal to the current element  or reach the beginning of the array.

        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement; //Since j now points to the element before the correct position, we increment j by 1 and assign the current element  to arr[j + 1].
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = SortArray(arr);
        for (int num : arr) {
            System.out.print(num + " " );
        }

    }
}



/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */