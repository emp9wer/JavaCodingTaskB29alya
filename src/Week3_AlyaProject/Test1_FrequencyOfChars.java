package Week3_AlyaProject;

public class Test1_FrequencyOfChars {
  /*
  Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

   */

    public static String frequencyOfCars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);

                if (ch == ch1) {
                    count++;
                }
            }
            if (result.contains(ch + "")) {
                continue;
            }
            result += ch;
            result += count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCars("AAABBCDD"));
    }


}
