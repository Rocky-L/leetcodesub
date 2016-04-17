/*
  Given a pattern and a string str, find if str follows the same pattern.

  Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

  Examples:
  pattern = "abba", str = "dog cat cat dog" should return true.
  pattern = "abba", str = "dog cat cat fish" should return false.
  pattern = "aaaa", str = "dog cat cat dog" should return false.
  pattern = "abba", str = "dog dog dog dog" should return false.
 */
//29 test cases all passed, 3ms solution
public class Solution {
    public static boolean wordPattern (String pattern, String str) {
        if (pattern.length() == 0 || str.length() == 0) return false;

        String[] words = str.split(" ");

        if (pattern.length() != words.length) return false;

        Map<String, Character> hashMap = new HashMap<String, Character>();
        char charInPat = '';

        for (int i = 0; i < pattern.length(); i++) {
            charInPat = pattern.charAt(i);
            if (hashMap.containsKey(words[i])) {
                if (hashMap.get(words[i]) != charInPat) return false;
            } else {
                if (hashMap.containsValue(charInPat)) return false;
                hashMap.put(words[i], charInPat);
            }
        }
        return true;
    }
}