public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {return nums;}

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int complement = 0;
        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (hashMap.containsKey(complement)) {
                int[] output = {i, hashMap.get(complement)};
                Arrays.sort(output);
                return output;
            }
            hashMap.put(nums[i], i);
        }
        return nums;
    }
}