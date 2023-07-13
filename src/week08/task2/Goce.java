package week08.task2;


import java.util.Arrays;

public class Goce {

    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */


    /**
     * Method moves all the zeroes to the last indexes of the int array.
     * @param array
     * @return
     */
    public static int[] zeroLastIndex(int[] array) {

        for (int i = 0; i < array.length; i++) { // determines the number of turns for swapping.
            for (int j = array.length-1; j > 0; j--) { // the last element will be checked first.
                if(array[j] != 0){ // if element, starting from the last index, is NOT zero,
                    int temp = array[j];  // ...
                    array[j] = array[j-1];// ...
                    array[j-1] = temp; // ...swaps the elements starting from the last index going to the first, placing the zeroes to the last indexes because of the if condition earlier.
                }
            }
        }
        return array;
        }




    public static void main(String[] args) {

        int[] arr = {0, 3, 4, 6, 0, 7, 0, 6, 8};
        System.out.println(Arrays.toString(zeroLastIndex(arr)));

    }


}
