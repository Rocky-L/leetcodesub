public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> removeDuplicate = new HashSet<Integer>();
        for(int element : nums) { removeDuplicate.add(element); }
        if (removeDuplicate.size() < nums.length) { return true; }
        return false;
    }
}