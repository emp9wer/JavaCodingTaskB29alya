package week05.task1;

public class Fatima {


    /**
     * method to find the unique characters in a str
     * @param args
     */
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String unique = ""; //unique is initialized as an empty string. This variable will store the unique characters found in the input string.

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            //Within the loop, we use the charAt(i) method to retrieve the character at the current index i from the string str. The character is stored in the variable each.

            if(str.indexOf(each) == str.lastIndexOf(each)  ){ //  check if each is a unique character in the string.

                unique += each;
            }

        }


        System.out.println(unique);

    }
}
