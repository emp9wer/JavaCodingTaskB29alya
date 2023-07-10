package week08.task2;

import java.util.Arrays;

public class Mariya {
    /*
     Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */


    public static void main(String[] args) {
        int[] array = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(zeroToTheEnd(array)));
    }

    /**
     * method to move all the 0 to the end of array
     * @param array
     * @return
     */
    public static int[] zeroToTheEnd(int[]array){
        int[]sorted=new int[array.length];

        for (int i = 0,j=0; i < array.length ; i++) { //looping through original array
            if(array[i]!=0) {                          //verifying if element is 0
                sorted[j] = array[i];                   //assigning accordingly
                j++;
            }
            else sorted[sorted.length-j-1]=array[i];

        }
        return sorted;
    }
}
