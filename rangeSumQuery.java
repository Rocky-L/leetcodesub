public class NumArray {
    
    private int[] numArray;
    public NumArray(int[] nums) {
        numArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            numArray[i] = nums[i];
        }
    }

    public int sumRange(int i, int j) {
        int sum = 0;

        while (i <= j) {
            sum += numArray[i];
            i++;
        }

        return sum;
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);