package week04.task3;

public class Lea {

    //Write a return method that can remove the duplicated values from the String

    public static void main(String[] args){

        String str1 = "AAABBBCCC";
        System.out.println("The given string is: " + str1);
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    private static String removeDuplicateChars(String sourceStr) {
        char[] arr1 = sourceStr.toCharArray();
        String targetStr = "";
        for (char value: arr1) {
            if (targetStr.indexOf(value) == -1) {
                targetStr += value;
            }
        }
        return targetStr;
    }
}






