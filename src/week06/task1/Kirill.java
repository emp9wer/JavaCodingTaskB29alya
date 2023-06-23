package week06.task1;

public class Kirill {
    //1️⃣  String_PasswordValidation
    //1. Write a return method that can verify if a password is valid or not.
    //-Requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper-case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special character
    //5. Password should at least contain a digit
    //-if all requirements above are met, the method returns true, otherwise returns  false

    /**
     * verify if a password is valid or not
     * @param password
     * @return boolean
     */
    public static boolean string_PasswordValidation(String password) {
//create booleans to store conditions
        boolean containUpper = false , containLower = false , containSpecial= false , containDigit = false;

//1. Password MUST be at least have 6 characters and should not contain space
        if (password.length() >= 6 && !password.contains(" ")) {
//loop to iterate through words letters
            for (int i = 0; i < password.length(); i++) {
//2. PassWord should at least contain one upper-case letter
                if (Character.isUpperCase(password.charAt(i))) {
                    containUpper=true;
                }
//3. PassWord should at least contain one lowercase letter
                if (Character.isLowerCase(password.charAt(i))) {
                    containLower=true;
                }
//4. Password should at least contain one special character
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    containSpecial=true;
                }
//5. Password should at least contain a digit
                if (Character.isDigit(password.charAt(i))) {
                    containDigit=true;
                }
            }
//-if all requirements above are met, the method returns true, otherwise returns  false
            if(containUpper&&containLower&&containSpecial&&containDigit){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("string_PasswordValidation(\"pas1!\") = " + string_PasswordValidation("pas1!"));//false
        System.out.println("string_PasswordValidation(\"Pass1!\") = " + string_PasswordValidation("Pass1!"));//true
        System.out.println("string_PasswordValidation(\"password\") = " + string_PasswordValidation("password"));//false
        System.out.println("string_PasswordValidation(\"Password\") = " + string_PasswordValidation("Password"));//false
        System.out.println("string_PasswordValidation(\"Password1\") = " + string_PasswordValidation("Password1"));//false
        System.out.println("string_PasswordValidation(\"Password1!\") = " + string_PasswordValidation("Password1!"));//true
    }

}
