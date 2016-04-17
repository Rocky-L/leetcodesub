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
        StringBuilder comparePat = new StringBuilder();
        int tracker = 0;

        while (tracker < pattern.length()) {
            if (hashMap.containsKey(words[tracker])) {
                comparePat.append(hashMap.get(words[tracker])+"");
            } else {
                if (hashMap.containsValue(pattern.charAt(tracker))) return false;
                hashMap.put(words[tracker], pattern.charAt(tracker));
                comparePat.append(pattern.charAt(tracker)+"");
            }
            tracker++;
        }

        if (comparePat.toString().equals(pattern)) return true;
        return false;
    }
}