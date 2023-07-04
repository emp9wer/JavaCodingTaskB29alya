package week07.task2;

import java.util.*;

public class Goce {

    /*
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex: int[] arr = {10, 9, 8, 7};
            arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

     */

    /**
     * Method returns elements from an array in ascending order
     * @return
     */
    public static List<Integer> ascendingArr() {

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i <arrNums.length; i++) {// Iterates through the array and adds array elements into the arrayList.
            arrList.add(arrNums[i]);
        }
        Collections.sort(arrList);// sort() from Collections class sorts elements in accenting order
        return arrList;// Returns the list with elements in ascending order.
    }

    static int[] arrNums;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        arrNums = new int[input.nextInt()];
        System.out.println("Please enter the numbers in the array: ");
        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] += input.nextInt();
        }

        System.out.println("Numbers from the array sorted in ascending order are: " + ascendingArr());

    }

}
