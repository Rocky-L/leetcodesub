public class Solution {
    public int climbStairs (int n) {
        if (n < 3) {return n;}
        int prevOne = 1, prevTwo = 2, currentStep = 0;
        for (int i = 3; i <= n; i++) {
            currentStep = prevOne + prevTwo;
            prevOne = prevTwo;
            prevTwo = currentStep;
        }
        return currentStep;
    }
}