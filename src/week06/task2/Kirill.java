package week06.task2;

public class Kirill {
    //2️⃣  Array_FindMaximum
    //Write a method that can find the maximum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

    /**
     * find the maximum number from an int Array
     * @param arr
     * @return int
     */
    public static int array_FindMaximum (int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6} ; // ==> 99
        System.out.println("array_FindMaximum(arr) = " + array_FindMaximum(arr));// array_FindMaximum(arr) = 99
    }



}
