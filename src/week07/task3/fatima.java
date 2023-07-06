package week07.task3;

public class fatima {

    /**
     * method that sort an int array in descending order without using the sort method of the Arrays class
     * @param array
     * @return
     */
    public static int[] SortArray(int[] array) {

        int n = array.length;



        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < currentElement) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        arr = SortArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

// that what happened inside the loop :


//    Compare current element = 20 with the element at index j = 0, which is 10.
//        Since 10 is less than 20, no shifting is required in this case.
//        So: Insert the current element into its correct position.
//
//        Increment j to j + 1, which is 1.
//        Assign the current element to arr[j + 1], which is arr[1] = current element.
//        The array becomes [10, 20, 7, 8, 90].
//        Iteration complete for the second element (20).
//
//        The array at this stage is [10, 20, 7, 8, 90], with the first two elements sorted.
//        Next, move to the third element (7).
//
//        -> Compare the current element with elements in the sorted part.
//
//        Compare current element = 7 with the element at index j = 1, which is 20.
//        Since 20 is greater than 7, we shift 20 to the right.
//        The array becomes [10, 20, 20, 8, 90].
//        -> (continued): Compare the current element with the next element (10).
//
//        Compare current element = 7 with the element at index j = 0, which is 10.
//        Since 10 is greater than 7, we shift 10 to the right.
//        The array becomes [10, 10, 20, 8, 90]. AND SO ON...


/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */