/*
  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

  For example,
  "A man, a plan, a canal: Panama" is a palindrome.
  "race a car" is not a palindrome.
  For the purpose of this problem, we define empty string as valid palindrome.
 */
//476 test cases all passed, 48ms solution
public class Solution {
    public boolean isPalindrome (String s) {
        s = s.toLowerCase().replaceAll("[^a-z\\d]+", "");
        for(int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}