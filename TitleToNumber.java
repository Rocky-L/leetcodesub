public class Solution {
    public int titleToNumber (String s) {
        if (s.equals("")){return 0;}
        int len = s.length(), column = 0;
        for (int i = len-1; i >= 0; i--) {
            column += ((int) Math.pow(26, i)) * (s.charAt(len-i-1) - 65 + 1);
        }
        return column;
    }
}