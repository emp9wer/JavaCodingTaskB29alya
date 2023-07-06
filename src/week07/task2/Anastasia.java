package week07.task2;

public class Anastasia {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};

    /**
     * method to sort array in ascending order
     * @param arr
     * @return
     */
    public static int[] sortAscending(int[] arr) {
        if (arr.length <= 1) {
            return arr; // If the array has 0 or 1 element, it is already sorted
        }


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { //checking if the element is smaller than the next one and swap elements if they are in the wrong order
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
        int[] sortedArray = sortAscending(arr);

        System.out.print("Sorted array in ascending order: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
