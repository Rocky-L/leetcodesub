public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) {return -1;}
        else if (nums.length == 1) {return nums[0];}

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1) { return nums[i]; }
            if (nums[i] != nums[i+1]) {return nums[i]; }
        }

        return -1;
    }
}

/*
 Best Solution:
 public int singleNumber(int[] nums) {
    int res = 0;
    for(int num : nums) {
       res ^= num;
    }
    return res;
 }
 */