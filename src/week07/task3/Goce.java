package week07.task3;

import java.util.*;

public class Goce {

    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr); ==> {90, 20, 10, 8, 7};
     */

    /**
     * Method returns elements from an array in descending order
     *
     * @return
     */
    public static List<Integer> descendingArr() {

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {// Iterates through the array and adds array elements into the arrayList.
            arrList.add(arr[i]);
        }
        Collections.sort(arrList);// sort() from Collections class sorts elements in accenting order
        Collections.reverse(arrList);// sort() from Collections class sorts elements in descending order
        //int[] arr = new int[arrList.size()];
        return arrList;// Returns the list with elements in descending order.
    }

    static int[] arr;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        arr = new int[input.nextInt()];
        System.out.println("Please enter the numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] += input.nextInt();
        }

        System.out.println("Numbers from the array sorted in descending order are: " + descendingArr());

    }
}
