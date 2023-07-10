package week08.task2;

import java.util.Arrays;

public class Kirill {
    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveZerosToTheEnd(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length ; i++) {
            if (arr[i] != 0) {
                res[j++] = arr[i];
            }
        }
        return res;
        }
    public static void main(String[] args) {
        int[] given = {1,0,2,3,0,4,0,0,5};
        System.out.println(Arrays.toString(moveZerosToTheEnd(given)));
        int[] given1 = {1,0,2,3,0,4,0,0,0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(given1)));
    }
    }
