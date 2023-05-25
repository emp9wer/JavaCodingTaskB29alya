package weekEnding052823;
/*
Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
- for numbers which are multiple of 3 print "FIN" instead of the number,
- for numbers which are multiple of 5, print "RA" instead of the number,
- and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class Task3_FINRA {



    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            finra(i);
        }
    }
        public static void finra(int number){
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FINRA ");}
           else  if (number % 3 == 0 ) {
                System.out.print("FIN ");
            } else if (number % 5 == 0 ) {
                System.out.print("RA ");

            } else {
                System.out.print(number+" ");
            }
        }


}
