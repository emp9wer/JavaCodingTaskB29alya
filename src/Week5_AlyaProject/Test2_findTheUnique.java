package Week5_AlyaProject;

import java.util.HashMap;
import java.util.Map;

public class Test2_findTheUnique {

  /*
  Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
   */
  public static void main(String[] arg) {
      String str = "AAABBBCCCDEF";

      Map<Character, Integer> unique = new HashMap<>();

      for( int j = 0; j < str.length(); j++) {

          int count =0;

          for (int i = 0; i < str.length(); i++) {

               if(str.charAt(i) == str.charAt(j)) count++; }

          if( count == 1){
              unique.put(str.charAt(j), count); }

      } System.out.println(unique);}

}

