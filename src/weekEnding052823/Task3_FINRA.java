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

            finra(30);

    }
        public static void finra(int number){
        for(int i=1;i<number;i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");}
           else  if (i % 3 == 0 ) {
                System.out.print("FIN ");
            } else if (i % 5 == 0 ) {
                System.out.print("RA ");

            } else {
                System.out.print(i+" ");
            }
        }


}
