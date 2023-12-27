/*
You are going to be given an array of integers. Your job is to take that array and find an index N where
 the sum of the integers to the left of N is equal to the sum of the
 integers to the right of N. If there is no index that would make this happen, return -1.
*/

import java.util.Arrays;

public class EqualSidesOfAnArray {
  public static int findEvenIndex(int[] arr) {
    int leftSide = 0;
    int rightSide = Arrays.stream(arr).sum();

            for (int i = 0; i < arr.length; i++) {
                rightSide -= arr[i];
                if (leftSide == rightSide) {
                    return i;
                }
                leftSide += arr[i];
            }
    return -1;
  }
}