public class Solution {
    public static int singleNumber (int[] nums) {
        if(nums.length <= 3) {return nums[0];}

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i += 3) {
            if (nums[i] != nums[i+1] || nums[i] != nums[i+2])
            return nums[i];
        }
        return nums[nums.length-1];
    }
}