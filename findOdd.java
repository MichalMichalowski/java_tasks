/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {
        public static int findIt(int[] a) {
            List<Integer> nums = Arrays.stream(a).boxed().toList();
            List<Integer> distinctNums = Arrays.stream(a).boxed().distinct().toList();
            int result = a[0];
            if (nums.size() > 1) {
                for (Integer v : distinctNums) {
                    if (Collections.frequency(nums, v) % 2 != 0) {
                        result = v;
                    }
                }
            }
            return result;
        }
    }