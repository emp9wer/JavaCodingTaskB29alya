package week03.task2;

public class Zack {
    /*
    ========== Numbers -- Reverse Negative Number ==========
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
     */

    public static void main(String[] args) {
        System.out.println("reverseNum(-35) = " + reverseNum(-35));
    }

    /**
     * reverses digits of a negative number and return it as int
     * @param num
     * @return
     */
    public static int reverseNum(int num) {

        // convert it to String object in order to use reverse() from StringBuilder class
        // -35 => 53-
        String str = new StringBuilder(""+num).reverse().toString();

        // -  +  53-  => -53-
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1); // removes - sign from the end of the string
        }
        // -53 but it still is a String object

        return Integer.valueOf(str); // returns it as int value as -53
    }


}
