package week08.task2;

import java.util.Arrays;

public class Anastasia {
  //   Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
  public static void moveZerosToEnd(int[] arr) {
      int n = arr.length;
      int count = 0; // Count of non-zero elements

      // Traverse the array and move non-zero elements to the front
      for (int i = 0; i < n; i++) {
          if (arr[i] != 0) {
              arr[count] = arr[i];
              count++;
          }
      }

      // Fill the remaining elements with zeros
      while (count < n) {
          arr[count] = 0;
          count++;
      }
  }

    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 2, 0, 5, 0, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println("Array with Zeros Moved to End: " + Arrays.toString(arr));
    }

}
