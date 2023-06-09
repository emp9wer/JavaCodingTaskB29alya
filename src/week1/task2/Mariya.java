package week1.task2;

import java.util.Scanner;

/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */
public class Mariya {
    public static String divide(int num1, int num2){
        if(num2==0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int result=0;
        while(num1>=num2){
            num1-=num2;
            result++;
        }

        return ""+result+" reminder is "+num1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Result of division is: "+divide(num1,num2));
    }


}
