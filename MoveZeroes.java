public class Solution {
    public void moveZeroes (int[] nums) {
        int startIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (startIndex == -1) {startIndex = i;}
                while (startIndex < nums.length-1 && nums[startIndex] == 0) {
                    startIndex++;
                }
                nums[i] = nums[startIndex];
                nums[startIndex] = 0;
            }
        }
    }
}