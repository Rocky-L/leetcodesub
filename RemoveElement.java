/*
  Given an array and a value, remove all instances of that value in place and return the new length.

  Do not allocate extra space for another array, you must do this in place with constant memory.

  The order of elements can be changed. It doesn't matter what you leave beyond the new length.

  Example:
  Given input array nums = [3,2,2,3], val = 3

  Your function should return length = 2, with the first two elements of nums being 2.
 */

//113 Test cases passed ==> 1ms solution
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int len = nums.length, start = 0, end = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                if(len == nums.length) start = i;
                len--;
            } else if (nums[i] > val) {
                end = i;
                break;
            }
        }
        if (len > 0) {
            for(int i = start; i < len; i++) {
                nums[i] = nums[end];
                end++;
            }
        }
        return len;
    }
}