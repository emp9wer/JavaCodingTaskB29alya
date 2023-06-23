package week05.task1;

public class Kirill {

    //1️⃣  String - Find the unique
    //Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

    /**
     * finds the unique characters from the String
     * @param given
     * @return
     */
    public static String findTheUnique (String given){
        String res="";

        for (int i = 0; i < given.length(); i++) { // outer loop iterates through each letter of given string
            int count =0;
            for (int j = 0; j < given.length(); j++) { //inner loop iterates through each letter of given string
                if(given.charAt(i)==given.charAt(j)){ // we compare each char of string with char that is outer loop is on with each char of word by using inner loop   EX:  word = AAABBBCCCDEF   outer loop on A [index 0]
                    //                                          0123456789.....
                    //                                                         inner loop will
                    //
                    count++;
                }
            }
            if(count==1){
                res+=""+given.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("findTheUnique(\"AAABBBCCCDEF\") = " + findTheUnique("AAABBBCCCDEF"));
        System.out.println("findTheUnique(\"AAABBBCCAABBCDEF\") = " + findTheUnique("AAA11223BBBCCAABBCDEF"));
    }
}
