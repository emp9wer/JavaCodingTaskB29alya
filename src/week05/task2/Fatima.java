package week05.task2;

public class Fatima {

    /**
     * reverse the given str
     * @param args
     */
    public static void main(String[] args) {

        String chars ="ABCD";
        String reverseChars="";


        for (int i = chars.length() - 1; i >= 0; i--) {
            reverseChars += chars.charAt(i);
        }

        System.out.println(reverseChars);

    }

    }


    /*
    In the first iteration, i is assigned the value of chars.length() - 1, which is 3 (since the length of "ABCD" is 4). The character at index 3 in chars is 'D'. Thus, reverseChars becomes "D".

In the second iteration, i is decremented to 2. The character at index 2 in chars is 'C'. reverseChars now becomes "DC".

In the third iteration, i is decremented to 1. The character at index 1 in chars is 'B'. reverseChars is now "DCB".

In the fourth and final iteration, i is decremented to 0. The character at index 0 in chars is 'A'. reverseChars becomes "DCBA".
     */

/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */