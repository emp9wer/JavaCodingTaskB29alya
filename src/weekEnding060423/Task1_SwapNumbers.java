package weekEnding060423;

import java.util.Scanner;

public class Task1_SwapNumbers {
    /*
    Numbers -- Swap Numbers
Swap two variable' values without using a third variable
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        num1+=num2;
        num2=num1-num2;
        num1-=num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

}
