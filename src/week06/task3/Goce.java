package week06.task3;


public class Goce {
    //Write a method that can return the sum of the digits in a String
    //Ex:  "12 java 5 apple 3"  ==>  20

    public static int sum(String str) {

        String[] strWordArr = str.split(" ");

        String strNumber = "";
        int sum = 0;

        for (String eachWord : strWordArr) {
            String temp = "";

            for (int i = 0; i < eachWord.length(); i++) {

                if (Character.isDigit(eachWord.charAt(i))) {
                    strNumber = "" + eachWord.charAt(i);
                    sum += Integer.parseInt(strNumber);
                }
            }

        }

        return sum;

        }

    public static void main(String[] args) {
        System.out.println(sum("1 monkey 6"));
    }
}

