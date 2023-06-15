package week04.task2;
import java.util.Arrays;
import java.util.Scanner;

public class Mariya {
    /*
    Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false

     */
public static boolean isSameLetters(String one, String two){
    if (one.length() != two.length()) {
        return false;
    }

    char[] arr1 = one.toCharArray();
    char[] arr2 = two.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
}

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please write your string:");
        String one = in.next();
        System.out.println("Please write your string:");
        String two = in.next();
        System.out.println("Srtings are made with the same letters : "+ isSameLetters(one,two));

    }

}