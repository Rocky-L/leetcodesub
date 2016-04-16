/*
  Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

  Note:
  You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
// 59 test cases all passed, 2ms solution
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == m) return;
        else if (n == 0) return;

        int temp = 0;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > nums2[0]) {
                temp = nums1[i];
                nums1[i] = nums2[0];
                for (int j = 1; j < n; j++) {
                    if (temp > nums2[j]) {nums2[j-1] = nums2[j];}
                    else {
                        nums2[j-1] = temp;
                        j = n;
                    }
                }
                if (temp > nums2[n-1]) nums2[n-1] = temp;
            }
        }

        int index = 0;
        for (int i = m; i< m+n; i++) {
            nums1[i] = nums2[index];
            index++;
        }
    }
}