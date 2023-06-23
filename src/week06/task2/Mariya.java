package week06.task2;
/*
 Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

 */
public class Mariya {
    /**
     * method to find max number in array
     * @param arr
     * @return
     */
    public static int array_FindMaximum(int arr[]) {
        int max = arr[0]; // assume that first element is the maximum number

        for (int i = 1; i < arr.length; i++) { // i: 1, 2, 3, 4...

            if (arr[i] > max) { // compares the element of the array with current maximum number
                max = arr[i]; // replace the current maximum number
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("maximum number : "+array_FindMaximum(arr));
    }
}
