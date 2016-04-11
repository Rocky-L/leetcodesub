public class Solution {
    public int searchInsert (int[] nums, int target) {
        if (nums.length == 0) {return 0;}
        int min = 0, max = nums.length, mid = 0;

        if(nums[0] > target){return 0;}
        if(nums[nums.length-1] < target){return nums.length;}
        while(min <= max) {
            mid = (max+min)/2;
            if(nums[mid] > target){max = mid-1;}
            else if (nums[mid] < target){min = mid+1;}
            else {return mid;}
        }
        return (int)Math.max(min,max);
    }
}