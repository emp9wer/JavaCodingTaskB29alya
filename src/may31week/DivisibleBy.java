package may31week;

public class DivisibleBy {
    public static void main(String[] args) {


        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%15 !=0)
                System.out.print("\nDivisible by 3: " +i+ " ");

        }


        for (int i=1; i<=100; i++) {
            if (i%5==0 && i%15 != 0)
            System.out.print("\nDivisible by 5: "+i+ " ");
        }


        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%5==0 & i%15==0)
                System.out.print("\nDivisible by 15: "+i + " ");
        }



    }
}

