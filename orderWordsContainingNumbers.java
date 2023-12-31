/*
Your task is to sort a given string. Each word in the string will contain a single number. 
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
*/

import java.util.Arrays;

public class Order {
        public static String order(String words) {
            if (words.isEmpty()) {
                return "";
            }
            String[] wspl = words.split(" ");
            String[] newWordOrder = new String[wspl.length];

            for (int i = 0; i < wspl.length; i++) {
                char[] charArr = wspl[i].toCharArray();
                Arrays.sort(charArr);
                int position = Character.getNumericValue(charArr[0])-1 ;
                newWordOrder[position] = wspl[i];
            }

            return String.join(" ", newWordOrder);
        }
    }
	
// OR :

import java.util.Arrays;
import java.util.Comparator;

public class Order {
  public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
  }
}