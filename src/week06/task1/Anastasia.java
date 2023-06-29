package week06.task1;
/*
 String_PasswordValidation
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */
public class Anastasia {
    public static boolean passwordIsValid(String password) {
        //#1: Password length should be at least 6 characters and NO space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // #2:Password has to have at least one uppercase letter
        boolean hasUppercase = false;
        // #3: --> at least one lowercase letter
        boolean hasLowercase = false;
        // #4 --> at least one special character
        boolean hasSpecialChar = false;
        // #5 --> contain at least one digit
        boolean hasDigit = false;

        // Check each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                // Check if the character is a special character
                if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true;
                }
            }
        }

        // Return true if all requirements are met
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }

        public static void main(String[] args) {
            String password = "PrivetPrivet456$";
            boolean isValid = passwordIsValid(password);
            System.out.println("Password is valid: " + isValid);
        }

}
