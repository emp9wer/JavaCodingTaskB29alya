public class Runner {
    public static void main(String[] args) {
        System.out.println("---------------------even/odd----------------------");

        System.out.println(NumbersOddEven.identify(4));//Even
        System.out.println(NumbersOddEven.identify(5));//Odd

        System.out.println("--------------------divideWoOperator-----------------------");

        System.out.println(DivideWithoutOperator.divideWoOperator(14,2)); //7

        System.out.println("--------------------FINRA-----------------------");

        FINRA.finra();

    }
}
