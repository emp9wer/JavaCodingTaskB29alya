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
public class Mariya {
    /**
     * method verifying if password matches requirements
     * @param str
     * @return
     */
    public static boolean passwordValidation(String str){
        if (str.length() < 6 || str.contains(" ")) {
            return false;
        }
        boolean isUpper=false, isLower=false, isSpecial=false, isDigit=false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z') isUpper = true;
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z') isLower = true;
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9') isDigit = true;
           else isSpecial=true;

        }
        return isDigit&&isUpper&&isLower&&isSpecial;
    }

    public static void main(String[] args) {

        String password = "Password123!";
        System.out.println("Given password is valid: "+passwordValidation(password));
    }
}
