/*
  Validate if a given string is numeric.

  Some examples:
  "0" => true
  " 0.1 " => true
  "abc" => false
  "1 a" => false
  "2e10" => true
  Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 */

//1481 test cases passed, 44ms solution
public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.contains(".")) {
            if (s.contains("e"))
                return s.matches("(-|\\+)?(\\d+(\\.\\d*e(-|\\+)?\\d+)|(\\.\\d+e(-|\\+)?\\d+))");
            else
                return s.matches("(-|\\+)?(\\d+(\\.\\d*)|(\\.\\d+))");
        } else if (s.contains("e")) {
            return s.matches("(-|\\+)?(\\d+(e(-|\\+)?\\d+))");
        } else {
            return s.length() > 0 && s.matches("(-|\\+)?(\\d+)");
        }

    }
}

//52ms solution
public boolean isNumber(String s) {
    s = s.trim();
    return s.length() > 0 && s.matches("(-|\\+)?((\\d+)|\\d+(\\.\\d*)|(\\.\\d+)|\\d+(e(-|\\+)?\\d+)|\\d+(\\.\\d*e(-|\\+)?\\d+)|(\\.\\d+e(-|\\+)?\\d+)?)");
}