public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int left = 1, right = 1;

        for (int i = 0; i < nums.length; i++) {
            left *= nums[i];
            right *= nums[nums.length-i-1];
            leftProduct[i] = left;
            rightProduct[nums.length-i-1] = right;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) { output[i] = rightProduct[i+1]; }
            else if (i == nums.length - 1) { output[i] = leftProduct[i - 1]; }
            else {
                output[i] = leftProduct[i - 1] * rightProduct[i + 1];
            }
        }
        return output;
    }
}