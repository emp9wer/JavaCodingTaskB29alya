package week05.task1;

public class Fatima {


    /**
     * method to find the unique characters in a str
     * @param args
     */
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }


        System.out.println(unique);

    }
}
