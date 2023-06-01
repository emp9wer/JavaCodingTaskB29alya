package week2;

public class SwapNumbers {
    /*
    1️⃣
Numbers -- Swap Numbers
Swap two variable' values without using a third variable

     */
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a+b; // a=4+2=6

        b=a-b; // b=6-2=4
        a=a-b; // a=6-4=2

        System.out.println("swap");

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
