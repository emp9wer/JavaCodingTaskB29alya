package week06.task3;

import com.sun.tools.javac.Main;

/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20

 */
public class Anastasia {
    public static void main(String[] args) {
       String str = "12 java 5 apple 3";
       String num = "";
       int sum = 0;

       for(int i = 0; i< str.length(); i++){
           if(Character.isDigit(str.charAt(i))){
               num=num+str.charAt(i);
           }
           else{
               if(!num.equals("")){
                   sum=sum+Integer.parseInt(num);
                   num="";
               }
           }
       }

        System.out.println(sum);

    }
}
