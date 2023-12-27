/*
Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
*/

import java.util.List;
import java.util.stream.Collectors;

public class Vowels {
        public static int getCount(String str) {
            List<Character> vowelList = str.chars().mapToObj(c -> (char)c)
                    .filter(c -> c == 'a' ||  c == 'e' ||  c == 'i' ||  c == 'o' ||  c == 'u')
                    .collect(Collectors.toList());
            return vowelList.size();
        }

    }
	
	
// OR:

public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}