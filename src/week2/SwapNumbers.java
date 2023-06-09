package week2;

public class SwapNumbers {

        public static void main(String[] args) {
            int a = 100;//Initialize two integer variables, a and b, with the values 10 and 20.
            int b = 5;
            a = a + b; // Assign the sum of a and b to a (a = a + b)
            // Now a holds the value of 10 + 20, which is 30.

            b = a - b; // Assign the difference of a and b to b. (b = a - b)
            // Now b holds the value of 30 - 20, which is 10.
            a = a - b; //Assign the difference of a and b to a (a = a - b)
            //Now a holds the value of 30 - 10, which is 20.

            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }

    }


/*
Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */



