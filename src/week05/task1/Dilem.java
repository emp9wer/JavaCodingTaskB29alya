package week05.task1;

public class Dilem {
    /**
     * Write a return method that can find the unique characters from the String
     *  Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique += arr[j];
            }
        }

        return unique;
    }

    public static void main(String[] args) {

        String str= "AAABBBCCCDEF";
        System.out.println(unique(str));
    }


}

