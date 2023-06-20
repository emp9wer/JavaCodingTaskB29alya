package week04.task2;

import java.util.Arrays;

public class Kirill {
    //2️⃣  String - Same letters
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false


    //version 1 using nested loop


    /**
     * method that checks if a string is built out of the same letters as another string version1
     * @param a
     * @param b
     * @return boolean
     */
    public static boolean areSameLetters(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }

        String temp="";
        for(int i = 0; i<a.length();i++){
            for(int j = 0; j<a.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    temp+=""+b.charAt(j);
                }
            }
        }
        return temp.equals(a);

    }

    //version 2 using Arrays.sort method

    /**
     * method that checks if a string is built out of the same letters as another string version2
     * @param a
     * @param b
     * @return
     */
    public static boolean areSameLetters2(String a, String b){
        char[] charsA;
        charsA = a.toCharArray();
        Arrays.sort(charsA);

        char[] charsB;
        charsB = b.toCharArray();
        Arrays.sort(charsB);

        if(Arrays.toString(charsA).equals(Arrays.toString(charsB))){
            return true;
        }else {
           return false;
        }
    }



    public static void main(String[] args) {

        System.out.println("---------------------v1----------------------");

        System.out.println("areSameLetters(\"abc\",\"cab\") = " + areSameLetters("abc", "cab"));

        System.out.println("areSameLetters(\"abc\",\"abb\") = " + areSameLetters("abc", "abb"));

        System.out.println("---------------------v2----------------------");

        System.out.println("areSameLetters2(\"abc\",\"cab\") = " + areSameLetters2("abc", "cab"));

        System.out.println("areSameLetters2(\"abc\",\"abb\") = " + areSameLetters2("abc", "abb"));
    }

}
