/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.
Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
*/
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
            String binNum = "";
            for (Integer n : binary) {
                binNum += n.toString();
            }
            return Integer.parseInt(binNum, 2);
        }
}