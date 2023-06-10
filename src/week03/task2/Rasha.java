package week03.task2;




/*
Numbers--Reverse negative Number
write a return method that can reverse negative number and return it as int
 */

public class Rasha {
    public static int reverseNum(int num) {
        String num1 = Integer.toString(num);
        String result = "";
        for (int i = num1.length() - 1; i >= 1; i--) {
            result += num1.charAt(i);
        }
        int numResult = Integer.parseInt(result);
        return (numResult * (-1));

    }
}