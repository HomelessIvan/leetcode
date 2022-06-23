package leetcode4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = Stream.of(nums1, nums2).flatMapToInt(Arrays::stream).sorted().toArray();
        boolean isLengthEven = nums.length % 2 == 0;
        if (!isLengthEven)
            return nums[nums.length / 2 - 1];
        else
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2 ])/2;
    }
}