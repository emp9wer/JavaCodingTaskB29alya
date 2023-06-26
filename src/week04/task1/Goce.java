package week04.task1;

import java.util.Scanner;

public class Goce {

    //String - Frequency of Characters`
    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    /**
     * Method counts each character's frequency in the string
     *
     * @param str
     * @return
     */
    public static String frequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {//first iteration of str argument
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {// second iteration of str argument in order to compare it with the first and increment frequency accordingly.
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if (!result.contains("" + str.charAt(i))) {//innitially result variable is empty so condition is true.
                result += "" + str.charAt(i) + frequency;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your characters: ");
        String enter = input.nextLine();
        System.out.println("The frequency of each character in your input is: ");
        System.out.println(frequencyOfChars(enter));

    }
}
