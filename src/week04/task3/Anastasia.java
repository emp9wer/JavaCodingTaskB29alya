package week04.task3;

import java.util.Scanner;

public class Anastasia {

//Write a return method that can remove the duplicated values from the String
//  Ex: removeDup("AAABBBCCC") ==> ABC
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Write your characters:");
            String original = in.next();
            System.out.println("Unique characters are: "+ uniqueChars(original));

        }

        public static String uniqueChars(String str) {
            //TODO: write your code

            String unique = "";
            for(int i=0; i<str.length(); i++){
                char each = str.charAt(i);
                if(!unique.contains(""+each) ){
                    unique += each;
                }



            }
            return unique;
        }

    }


