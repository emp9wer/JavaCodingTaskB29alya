package week1.task3;

public class Fatima {
    public static void Numbers() {
        for (int i = 1; i <= 30; i++) { // This loop will iterate from i = 1 to i = 30 (inclusive) and increment i by 1 after each iteration.

            if (i % 3 == 0) { // checks if i is divisible by 3 without a remainder
                System.out.println("FIN");

            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Numbers();
    }







}
/*
Write a method that prints out the numbers from 1 to 30 but;
- for numbers which are multiple of 3 print "FIN" instead of the number,
- for numbers which are multiple of 5, print "RA" instead of the number,
- and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */

