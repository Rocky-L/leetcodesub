public class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums.length < 3) {return nums;}

        Arrays.sort(nums);
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                result[count] = nums[i];
                count++;
            } else {i++;}
        }
        if(count < 2) {result[count++] = nums[nums.length-1];}
        return result;
    }
}