package Week2_AlyaProject;

public class Swap {

    public static void main(String arg[]) {
        System.out.println("Enter the value of x and y");

        int x =1;
        int y = 2;
        System.out.println("before swapping numbers: " + x + " " + y);
        /*Swapping*/
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + "  " + y);
    }
}