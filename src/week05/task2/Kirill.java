package week05.task2;

public class Kirill {

    //2️⃣  String -- Reverse
    //Write a function that can reverse a String
    // Ex: Reverse("ABCD"); ==> DCBA

    /**
     * reverses a String
     * @param given
     * @return String
     */
    public static String reverseString (String given){
        String res ="";
        for (int i = given.length()-1; i >=0; i--) {
            res+=given.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));
        System.out.println("reverseString(\"Chuck Norris 2 3 4 5 6\") = " + reverseString("Chuck Norris 2 3 4 5 6"));
    }


}
