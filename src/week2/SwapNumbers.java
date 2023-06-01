package week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 15;
        int b = 25;

       // first I will get the sum of both nums. Then I will subtract one in order to get the other's value and assign that value to the other variable. This will update one of my variables value with the other variable's value. Lastly I'd  substract from the sum the newly assigned value in order to get the other variable's value.
       a = a + b;
       b = a - b;
       a = a - b;


        System.out.println("variable a is now " + a + " and variable b is now " + b);
    }

}
/*
Numbers -- Swap Numbers
Swap two variable' values without using a third variable
 */
