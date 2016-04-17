public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];

        if(s.length() != t.length()){ return false; }

        for(int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 97]++;
            letters[t.charAt(i) - 97]--;
        }

        Arrays.sort(letters);

        if(letters[25] > 0 || letters[0] < 0){
            return false;
        }
        return true;
    }
}