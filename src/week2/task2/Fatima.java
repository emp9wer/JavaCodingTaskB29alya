package week2.task2;

public class Fatima {
    public static void main(String[] args) {
        System.out.println("Divisible By 15");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


// we were to combine all the conditions into a single for loop, we would encounter an issue where a number divisible by both 3 and 5 (but not 15) would be printed in multiple sections, violating the specified requirements. By using separate for loops, we can ensure that each number is categorized correctly based on the given conditions.

//In this case, when i is 30, it will satisfy all three conditions: divisible by 15, divisible by 5, and divisible by 3. As a result, it will be printed in all three sections, which is not the desired outcome.



/*
Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */