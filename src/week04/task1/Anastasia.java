package week04.task1;

import java.util.Scanner;

public class Anastasia {
    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please write your String:");
            String yourString = in.next();
            System.out.println(countLetters(yourString));
        }

        public static String countLetters(String str){


            String result ="";

            for(int j = 0; j< str.length(); j++ ){
                int count = 0;
                char ch = str.charAt(j);

                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i)==ch){
                        count++;

                    }
                }
                if(!result.contains("" +ch)){
                    result = result+count+str.charAt(j);
                }

            }

            return result;




        }
}
