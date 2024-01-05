/*
Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!

*/

import java.util.List;
import java.util.ArrayList;

class SumDigPower {

        public static List<Long> sumDigPow(long a, long b) {
            List<Long> result = new ArrayList<>();

            for (;a < b; a++) {
                double sum = 0;
                char[] numArr = String.valueOf(a).toCharArray();
                for (int i = 0; i < numArr.length; i++) {
                    sum += Math.pow(Character.getNumericValue(numArr[i]), i + 1) ;
                }

                if ( a == sum) {
                    result.add(a);
                }
            }
            return result;
        }
    }
