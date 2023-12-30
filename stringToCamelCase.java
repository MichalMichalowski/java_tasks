/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized 
(known as Upper Camel Case, also often referred to as Pascal case). 
The next words should be always capitalized.
*/

import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
            String[] stringSplit = s.split("[-_]");
            StringBuilder sb = new StringBuilder();
            sb.append(stringSplit[0]);

            for (int i = 1; i < stringSplit.length; i++) {
                sb.append(stringSplit[i].substring(0,1).toUpperCase() + stringSplit[i].substring(1));
            }

            return sb.toString();
        }
}

// OR BETTER

import java.util.Arrays;

class Solution{

  static String toCamelCase(String str){
    String[] words = str.split("[-_]");
    return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
  }
}