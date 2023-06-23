package week06.task3;
/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20

 */
public class Mariya {
    /**
     * method to find sum of all  digits in a string
     * @param str
     * @return
     */
    public static int string_SumOfAllDigits(String str){
        int sum=0;
        for (int i = 0; i < str.length();i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){  //verify if character under index i is digit
                int j=i+1; String digit=""+str.charAt(i);  //helpful temporary variables: j - iterator for while loop, digit is a string for a number from our original string
                while(str.length()-1>j&&str.charAt(j)>='0'&&str.charAt(j)<='9') {//verifying if next character is also digit and making sure not to go outside of sting length
                    digit += str.charAt(j);//adding if next character is a digit to our number to make n-th digit
                    j++;i++;
                }

                    sum+=Integer.parseInt(digit);//finding numeric value of our string

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str= "12 java 5 apple 3";
        System.out.println("Sum of digits = "+string_SumOfAllDigits(str));

    }
}
