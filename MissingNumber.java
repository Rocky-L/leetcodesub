public class Solution {
    public int missingNumber(int[] nums) {
        int tracker = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == tracker) { tracker++; }
            else { return tracker; }
        }
        return tracker;
    }
}