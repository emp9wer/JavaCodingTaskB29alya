package week06.task3;

import java.util.Arrays;

public class Kirill {
    //3️⃣ String_SumOfAllDigits
    //Write a method that can return the sum of the digits in a String
    //Ex:  "12 java 5 apple 3"  ==>  20

    /**
     * return the sum of the digits in a String
     * @param a
     * @return int
     */
    public static int string_SumOfAllDigits (String a){
        String numbers="";
        int res =0;
    //java 12 java 5 apple 3 java java 3 3 java
        for (char c : a.toCharArray()) {
            if(Character.isDigit(c)||c==' '){
                numbers+=c;
            }
            numbers = numbers.replace("  "," ");
        }
      numbers = numbers.trim();
        for (String each : numbers.split(" ")) {
            res+=Integer.parseInt(each);
           // res+=Integer.valueOf(each);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("string_SumOfAllDigits(\"12 java 5 apple 3\") = " + string_SumOfAllDigits("12 java 5 apple 3"));

        System.out.println("string_SumOfAllDigits(\"java 12 java 5 apple 3 java java 3 3 java\") = " + string_SumOfAllDigits("java 12 java 5 apple 3 java java 3 3 java"));

        System.out.println("string_SumOfAllDigits(\" java   1000 java      5 apple     3 java    java   3 3         java   \") = " + string_SumOfAllDigits(" java   1000 java      5 apple     3 java    java   3 3         java   "));

        System.out.println("string_SumOfAllDigits(\"122 java 5 apple 3\") = " + string_SumOfAllDigits("122 java 5 apple 3"));
    }

}
