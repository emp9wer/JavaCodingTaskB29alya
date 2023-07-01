package week07.task1;

public class Kirill {
    //1️⃣  Array_FindMinimum
    //Write a method that can find the minimum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    /**
     * find the minimum number from an int Array
     * @param arr
     * @return int
     */
    public static int array_FindMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ea : arr) {
            if (ea < min) {
                min = ea;
            }
        }
        return min;
    }
    /**
     * find the maximum number from an int Array
     * @param arr
     * @return int
     */
    public static int array_FindMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ea : arr) {
            if (ea > max) {
                max = ea;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("array_FindMinimum(arr) = " + array_FindMinimum(arr));
        System.out.println("array_FindMaximum(arr) = " + array_FindMaximum(arr));
    }
}
