import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        System.out.println("---------------------even/odd----------------------");
        System.out.println(NumbersOddEven.identify(4));//4 is Even
        System.out.println(NumbersOddEven.identify(5));//5 is Odd


        System.out.println("--------------------divideWoOperator-----------------------");
        System.out.println(DivideWithoutOperator.divideWoOperator(8,-2));//-4
        System.out.println(DivideWithoutOperator.divideWoOperator(0,-2));//-0
        System.out.println(DivideWithoutOperator.divideWoOperator(8,2));//4


        System.out.println("--------------------FINRA-----------------------");
        FINRA.finra();
        //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA

    }
}
