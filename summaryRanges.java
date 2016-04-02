public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summary = new LinkedList<String>();
        int start = 0, end = 0;

        if(nums.length == 0) { return summary; }

        for(int i = 0; i <= nums.length; i++) {
            if (i == 0) {
                start  = 0;
                end = 0;
            } else if (i != nums.length && (nums[i] - nums[i-1]) == 1) {
                end++;
            } else {
                if(start == end) {
                    summary.add(nums[start]+"");
                } else {
                    summary.add(nums[start] + "->" + nums[end]);
                }
                start = i;
                end = start;
            }
        }

        return summary;
    }

}