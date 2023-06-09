package week03.task2;

import java.util.Scanner;

public class Goce {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a negative number");
            int negNum = input.nextInt();

            if (negNum >= 0) {
                System.out.println("Invalid input. Please enter a negative number");
                negNum = input.nextInt();
            }
            if (negNum >= 0) throw new ArithmeticException("Your session has ran out. Please try again in a new session.");

            System.out.println(reverseNegNum(negNum));

        }

    /**
     * takes a negative number and reveres its digits. Returns int value.
     * @param num
     * @return
     */
    public static int reverseNegNum(int num) {

            String[] y = Integer.toString(num).split("");
            String result = "";

            for (int i = y.length - 1; i > 0; i--) {
                result += y[i];
            }
            int b = Integer.parseInt("-" + result);
            return b;
        }

    }
/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -38  output: -83
 */

