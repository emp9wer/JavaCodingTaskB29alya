package week04.task1;

public class Kirill {
    //1️⃣  String - Frequency of Characters`
    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    /**
     * This method returns Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     * @param given
     * @return String
     */
    public static String frequencyOfCharacters(String given){
        String res ="";

        for (int i = 0; i<given.length() ; i++ ) {

            int count =0;

            for (int j = 0; j<given.length() ; j++ ){
                if(given.charAt(i)==given.charAt(j)){
                    count++;
                }
            }

            if(!res.contains(""+given.charAt(i))){
                res+= ""+given.charAt(i) + count;
            }
        }
        return res;

    }

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));
        System.out.println(frequencyOfCharacters("abcabcabc"));
        System.out.println(frequencyOfCharacters("aaaaaaaabbbbbbffffweeddddggggggg"));
        System.out.println(frequencyOfCharacters("aabbbcccccaaaaaddddbbbb"));
    }

}
