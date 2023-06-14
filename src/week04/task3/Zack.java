package week04.task3;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Zack {
    /*
    =========== String - Remove Duplicates =====================
    Write a return method that can remove the duplicated values from the String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        System.out.println("removeDup_1(\"AAABBBCCC\") = " + removeDup_1("AAABBBCCC"));
        System.out.println("removeDup_2(\"CCBBBAAAAA\") = " + removeDup_2("CCBBBAAAAA"));
    }

    // ============= SOLUTION 1 =============================
    /**
     * removes the duplicated letters from the given String
     * @param str
     * @return
     */
    public static String removeDup_1( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }

    // ============= SOLUTION 2 =============================
    /**
     * removes the duplicated letters from the given String
     * @param str
     * @return
     */
    public static String removeDup_2(String str) {
        // LinkedHasSet : removed the duplicates and keep the insertion order
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }




}
