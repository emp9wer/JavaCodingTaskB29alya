package week06.task1;

public class Fatima {
    public static boolean passwordTask () {

        // INCORRECT TASK :(

        String password = "Fatima1@";

        boolean hasSpecialChar = false;


        // 1. Password MUST be at least have 6 characters and should not contain space

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        char letter = 'A';

        //2- PassWord should at least contain one upper-case letter

        for (int i = 'a'; i < 'z'; i++) {
            if (letter >= 'a' && letter <= 'z') {
                return true;
            }
        }

        //3-PassWord should at least contain one lowercase letter


        for (int i = 'A'; i < 'Z'; i++) {
            if (letter >= 'A' && letter <= 'Z') {
                return true;
            }
        }

        //4. Password should at least contain one special character

        String specChar = "!@#$%^&*()-_=+[]{}\\|;:'\",.<>/?";

        for (char each : password.toCharArray()) {
            if (specChar.contains(Character.toString(each))) {
                return true;
            }


            boolean hasDigit = false;

            //5. Password should at least contain a digit
            for (int i = 0; i < 9; i++) {
                if (Character.isDigit(password.charAt(i))) {

                    return true;
                }



            }

        }
        return false;
    }

    public static void main(String[] args) {

        if (passwordTask()== true ){
            System.out.println( "The password is correct");
        }else {
            System.err.println("The password is incorrect") ;
        }



}}

/*
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */