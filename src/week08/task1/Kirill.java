package week08.task1;

import java.util.*;

public class Kirill {
    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */

    //no bug
    public static int[]  sumUpToZero(int n){
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException("1 < N < 100");
        }
        int[] res = new int[n];
        for (int i = 0; i < res.length-1; i++) {
            res[i++]=i;
            res[i]=-i;
        }
        return  res;
    }
     //no bug
    public static int[]  sumUpToZero1(int n){
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException("1 < N < 100");
        }
        int[] res = new int[n];
        for (int i = 1,j=0; i <= res.length; i++,j++) {
            res[j]=i;
        }
        int sum=0;
        for (int i = 0; i < res.length-1; i++) {
            sum += res[i];
            System.out.println(sum);
        }
        int deduct = 0;
        while (sum-deduct!=0){
            deduct++;
        }
        res[res.length-1]=-deduct;
        return  res;
    }

    //bug int n = 3 // possible 0 0 0
    public static int[]  sumUpToZero2(int n){
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException("1 < N < 100");
        }
        int[] res = new int[n];
        Random random = new Random();
        while (true){
            int sum=0;
            for (int i = 0,j=0; i < res.length; i++,j++) {
                int a =0;
                for (int k = 0; k < res.length ; k++) {
                        while ((res[k])==(a)){
                            if(random.nextInt(3)==2){
                                a = random.nextInt(res.length+1);
                            }else {
                                a = -random.nextInt(res.length+1);
                            }
                        }
                    }
                res[j]= a;
            }
            for (int k = 0; k < res.length; k++) {
                sum += res[k];
            }
            if(sum==0){
                break;
            }
        }

        return  res;

    }
    //bug
    public static int[] nUniqueIntegersThatSumUpTo0(int n, int numbersRange) {
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException("1 < N < 100");
        }
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        int sign = 0;
        while (set.size() < n-1) {
            if (sign % 2 == 0) {
                sign++;
                set.add(-random.nextInt(numbersRange));
                continue;
            }
            set.add(random.nextInt(numbersRange));
        }
        int sum = set.stream().mapToInt(Integer::intValue).sum();
        set.add(-sum);
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer each : set) {
            result[index++] = each;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero2(3)));

    }


}

