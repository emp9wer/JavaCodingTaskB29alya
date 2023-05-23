package week1;

public class NumbersOddEven {
    /*
    1️⃣

Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
     */

    public static String identify(int number){
        if(number%2==0){
            return number+ " is Even";
        }else{
            return number+ " is Odd";
        }
    }

}
