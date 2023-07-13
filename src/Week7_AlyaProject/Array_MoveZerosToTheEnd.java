package Week7_AlyaProject;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input: {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]

    /**
     * Write a method that can move all the zeros to last indexes of the array.
     * @param
     * @return moved
     */


    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(1, 0, 2, 0, 3, 0, 4, 0)));
    }

    public static int[] moveZeros(int... nums) {

        int[] moved = new int[nums.length];
        int index = 0; // 1

        for (int each : nums) { //  {1,0,2,0,3,0,4,0};
            if (each != 0) {
                moved[index++] = each;
            }
        }

        return moved;
    }

}



























