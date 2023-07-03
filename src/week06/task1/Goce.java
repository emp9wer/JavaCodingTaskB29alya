package week06.task1;

import java.util.Scanner;

public class Goce {

    //1. Write a return method that can verify if a password is valid or not.
    //-Requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper-case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special character
    //5. Password should at least contain a digit
    //-if all requirements above are met, the method returns true, otherwise returns  false

    public static boolean validPassword(String password) {
        if(password.length() < 6) return false;

        boolean isDigit = false, isSpecialChar = false, isUpperCase = false, isLowerCase = false;

        for (int i = 0; i < password.toCharArray().length; i++) {
            if ( (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ) isLowerCase = true;
            else if( (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') ) isUpperCase = true;
            else if( (password.charAt(i) >= '0' && password.charAt(i) <= '9') ) isDigit = true;
            else isSpecialChar = true;

        }
        return isDigit&&isSpecialChar&&isLowerCase&&isUpperCase;
    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pass = input.nextLine();

        System.out.println(validPassword(pass));

    }
}
