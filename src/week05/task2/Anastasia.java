package week05.task2;

public class Anastasia {
    //Write a function that can reverse a String
    public static String reverseString(String input) {
        //1. We convert the input string into a character array using the toCharArray() method.
        char[] charArray = input.toCharArray();
        // 2. We then use two pointers, start and end, initialized to the first and last pointers of the character array
        int start = 0;
        int end = input.length() - 1;

        // 3. We iterate while the start pointer is less than the end pointer.
        while (start < end) {
            // 4.  We swap the characters at the start and end positions using a temporary variable.
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers inward
            start++;
            end--;
        }
        // 5. Once the pointers cross each other, we have reversed the entire string. now we create the new String and return it:
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello, Dear Friends!";
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }
    //When you call the reverseString function and pass a string as an argument, that string will be assigned to the input parameter within the function's scope.
}
