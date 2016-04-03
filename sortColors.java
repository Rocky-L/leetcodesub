public class Solution {
    public void sortColors(int[] nums) {
        int numRed = 0, numWhite = 0, numBlue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) { numRed++; }
            else if (nums[i] == 1) { numWhite++; }
            else { numBlue++; }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < numRed && i >= 0) {nums[i] = 0;}
            else if (i < (numWhite+numRed) && i >= numRed) {nums[i] = 1;}
            else {nums[i] = 2;}
        }
    }
}