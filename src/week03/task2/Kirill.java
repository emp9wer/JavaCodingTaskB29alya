package week03.task2;

public class Kirill {
    /*
2️⃣
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -38  output: -83
     */

    public static int reverseNegative(int a){
        String b = String.valueOf(a);
        String temp = "";
        for (int i = b.length()-1; i>=1 ; i--) {
            temp+=b.charAt(i);
        }
      int res= Integer.parseInt(temp)*-1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-382464457));
        System.out.println(reverseNegative(-122353252));
    }
}
