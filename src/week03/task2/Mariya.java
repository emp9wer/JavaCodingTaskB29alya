package week03.task2;

import java.util.Scanner;

public class Mariya {

    /*
    Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -38  output: -83
     */


public static int reverseNumber(int num){

    int sign = 1;
    if(num<0){
        sign =-1;
        num*=sign;
    }

    int reverse=0;
    while(num>0){
        int digit = num%10;
        reverse = reverse*10+digit;
        num/=10;
    }
    return reverse*sign;
    /*
   String str=""+num;
    String reverse ="";

    for (int i = str.length()-1;i>=0;i--){
     reverse+=str.charAt(i);
   }
     int result =Integer.parseInt(reverse);

     return result*sign;
*/

}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int num = input.nextInt();
        System.out.println(reverseNumber(num));
    }

}
