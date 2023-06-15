package week04.task1;

public class Fatima {

    public static String frequencyOfChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int frequency = 1;

            // Count the frequency of the current character
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                frequency++;
                i++;
            }

            result += currentChar + "" + frequency;
        }


        return result;
    }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            String frequency = frequencyOfChars(input);
            System.out.println(frequency);  // Output: A2G1B2Q4
        }
    }























/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
        /*



There is a better way which is using map because :


//  Using str.length() or str.size() would only give us the total number of characters in the string, without accounting for the frequencies of individual characters.

//By using a Map, we can directly associate each character with its corresponding frequency. This makes it easier to track and update the frequency of each character as we iterate over the string.

         */