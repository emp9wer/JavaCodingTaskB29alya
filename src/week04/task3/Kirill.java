package week04.task3;

public class Kirill {
    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    /**
     * method that can remove the duplicated values from the String
     * @param a
     * @return String
     */
    public static String removeDuplicates(String a){
        //AAABBBCCC
        //012345678
        String res ="";
        for(int i =0; i<a.length(); i++){
            if(!res.contains(""+a.charAt(i))){
                res+=""+a.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"AAABBBCCC\") = " + removeDuplicates("AAABBBCCC"));
        System.out.println("removeDuplicates(\"111222333444aaaaBBBBaaadddDD\") = " + removeDuplicates("111222333444aaaaBBBBaaadddDD"));
    }

}
