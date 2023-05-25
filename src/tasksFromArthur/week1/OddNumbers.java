package src.tasksFromArthur.week1;

public class OddNumbers {
    public static void main(String[] args) {
        finra(5);
    }
    public static void finra(int num){
        for (int i = 1; i < 30; i++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(num+ " FINRA, ");
            } else if (num % 3 == 0) {
                System.out.print(num+" FIN, ");
            } else if (num % 5 == 0) {
                System.out.print(num+" RA, ");
            } else {
                System.out.println("Not divisible by 3, 5 or 15: "+num+ ", ");
            }
        }



    }
}
