package may31week;

public class SwapVariables {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

// Swapping the values
        a = a + b;  // a now holds the sum of both values (15)
        b = a - b;  // b now holds the original value of a (5)
        a = a - b;  // a now holds the original value of b (10)

        System.out.println(a);
        System.out.println(b);
// Values after swapping
// a = 10, b = 5
    }
}
