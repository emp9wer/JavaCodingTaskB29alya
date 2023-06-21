package week05.task1;

import java.util.Arrays;
import java.util.Collections;

public class Zack {
    /*
    ==================== String - Find the unique ==============================
      Write a return method that can find the unique characters from the String
           Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
        System.out.println("unique_1(\"AAABBBCCCDEF\") = " + unique_1("AAABBBCCCDEF"));
        System.out.println("unique_2(\"AAABTTTTBBCCCDEF\") = " + unique_2("AAABBBCCCDEF"));
    }

    // ============= SOLUTION 1 =============================
    /**
     * returns unique characters from the given String
     * @param str String
     * @return String
     */
    public static String unique_1(String str) {
        String[ ] arr=str.split("");
        String unique1="";
        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                unique1+=arr[j];
        }
        return unique1;
    }

    // ============= SOLUTION 2 =============================
    /**
     * returns unique characters from the given String
     * @param str String
     * @return String
     */
    public static String unique_2(String str) {
        String result ="";
        for(String each : str.split(""))
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

        return result;
    }

}
