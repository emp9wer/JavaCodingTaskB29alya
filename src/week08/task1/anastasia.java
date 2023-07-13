package week08.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers)
public class anastasia {
    /**
     * method to create an array with unique numbers given length
     * @param N
     * @return
     */
    public static int[] generateArrayWithZeroSum(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 1 and 100 (exclusive).");
        }

        int[] result = new int[N];
        Set<Integer> set = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            int randomNum;
            do {
                randomNum = getRandomNumber(N);
            } while (set.contains(randomNum));

            set.add(randomNum);
            result[i] = randomNum;
            sum += randomNum;
        }

        result[N - 1] = -sum;
        return result;
    }

    private static int getRandomNumber(int N) {
        return (int) ((Math.random() * (N - 1)) + 1);
    }
    public static void main(String[] args) {
        int N = 6;
        int[] zeroSumArray = generateArrayWithZeroSum(N);

        System.out.println(Arrays.toString(zeroSumArray));
    }
}
