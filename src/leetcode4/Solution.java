package leetcode4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] result = mergeSorted(nums1, nums2);


        boolean isLengthEven = result.length % 2 == 0;
        if (!isLengthEven)
            return result[result.length / 2];
        else
            return (double) (result[result.length / 2 - 1] + result[result.length / 2]) / 2;
    }

    private static int[] mergeSorted(int[] nums1, int[] nums2) {
        if (nums1.length==0)
            return nums2;
        if (nums2.length==0)
            return nums1;
        int[] result = new int[nums1.length + nums2.length];
        int i = 0;
        int index1 = 0;
        int index2 = 0;
        while (i < result.length) {

            if (nums1[index1] < nums2[index2]) {
                result[i] = nums1[index1];
                index1++;
            } else {
                result[i] = nums2[index2];
                index2++;
            }

            if (index1 == nums1.length){
                System.arraycopy(nums2, index2, result, i+1, nums2.length - index2);
                break;
            }

            if (index2 == nums2.length){
                System.arraycopy(nums1, index1, result, i+1, nums1.length - index1);
                break;
            }
            i++;
        }
        return result;
    }

}