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

        for (int i = 0; i < given.length(); i++) {
            int count =0;
            int tempIndex=0;
            for (int j = 0; j < given.length(); j++) {
                if(given.charAt(i)==given.charAt(j)){
                    count++;
                    tempIndex = j;
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
        System.out.println("findTheUnique(\"AAABBBCCAABBCDEF\") = " + findTheUnique("AAABBBCCAABBCDEF"));
    }
}
