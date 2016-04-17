public class Solution {
    public int[] countBits(int num) {
        int[] numOfOnes = new int[num+1];
        int count = 0;

        for (int i = 0; i <= num; i++) {
            String binaryStr = Integer.toBinaryString(i);
            char[] binaryChar = binaryStr.toCharArray();

            for(int j = 0; j < binaryChar.length; j++){
                if(binaryChar[j] == '1'){
                    count++;
                }
            }
            numOfOnes[i] = count;
            count = 0;
        }
        return numOfOnes;
    }
}