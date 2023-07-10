package week07.task1;

public class Mariya {
    /*
    Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    /**
     * method finds min integer in given array
     * @param arr
     * @return
     */
    public static int min_of_array(int[] arr)
    {
        int min = Integer.MAX_VALUE;           //assigning temp variable to the max possible value
        for (int i = 0; i < arr.length; i++) { // looping through array and comparing each value
            if (arr[i]<min) min=arr[i];
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 23, 44, 57, 6};
        System.out.println(min_of_array(arr));
    }
}
