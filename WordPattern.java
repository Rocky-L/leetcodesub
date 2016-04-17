/*
  Given a pattern and a string str, find if str follows the same pattern.

  Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

  Examples:
  pattern = "abba", str = "dog cat cat dog" should return true.
  pattern = "abba", str = "dog cat cat fish" should return false.
  pattern = "aaaa", str = "dog cat cat dog" should return false.
  pattern = "abba", str = "dog dog dog dog" should return false.
 */
//29 test cases all passed, 9ms solution
public class Solution {
    public static boolean wordPattern (String pattern, String str) {
        if (pattern.length() == 0 || str.length() == 0) return false;

        Map<String, Character> hashMap = new HashMap<String, Character>();
        String comparePat = "";
        int tracker = 0;

        for (String s : str.split("\\W+")) {
            if (hashMap.containsKey(s)) {
                comparePat += hashMap.get(s) + "";
            } else {
                if (hashMap.containsValue(pattern.charAt(tracker)) || tracker >= pattern.length()) return false;
                hashMap.put(s, pattern.charAt(tracker));
                comparePat += pattern.charAt(tracker)+"";
            }
            tracker++;
        }
        System.out.println(comparePat);

        if (comparePat.equals(pattern)) return true;
        return false;
    }
}