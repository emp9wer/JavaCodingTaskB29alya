package Week5_AlyaProject;

public class Test1_Reverse {
    /*

    Write a return method that can reverse String
Ex: Test1_Reverse("ABCD"); ==> DCB
     */
    public static String Reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(Reverse(" A ABCDFG"));
    }


}