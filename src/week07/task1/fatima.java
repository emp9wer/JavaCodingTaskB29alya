package week07.task1;

public class fatima {



    // create a static method that will return an in which is the minimum number :

    /**
     * retuen the minimum num of an array
     * @param array
     * @return
     */

    public static int MinimumNumber (int[] array ){

//declare and initialise an int arr
       int min= array[0]; // 0 because it's the first element of the array.

        for (int i = 1; i < array.length; i++) {

            if(array.length==0){
                System.err.println("Array cannot be empty");
            }

            if(array[i]< min){
                    min= array[i];
                }

        }
return min;
    }


// for example array[0]=99 in our exp :
    // so in the loop , it started by array[1] which is the next number 12 , 12<99 is true so the min will be 12 ( min=12) next number is 23 .. will stay like that till 6 is 6<12 true so 6 is min

// now let's create a main method to run our code :


    public static void main(String[] args) {

        int[] array = {99, 12, 23, 32, 44, 57, 6};
int min = MinimumNumber(array); // call the method above

        System.out.println("The minimum number of this array is :" + min);

    }


}




/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */


//// or put everything inside the main method
//public static void main(String[] args) {
//    int[] numbers = {100,20,500,40,-10,30};
//    int min = numbers[0]; // we assume that first element is the min
//
//    for (int i = 1; i < numbers.length; i++) { // i: 1,2,3,4,
//
//        if(numbers[i] < min){// compare the element of the array with current minimum number
//            min = numbers[i];// replace the current minimum number .
//        }
//
//
//    }
//
//
//    System.out.println("min = " + min);