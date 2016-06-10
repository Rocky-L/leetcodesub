// all 22 test cases passed, 14ms solution
public class ReverseWords {
    public String ReverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder strBuilder = new StringBuilder();
        System.out.println(words.length);
        for(int i = words.length - 1; i >= 0; i--) {
            strBuilder.append(words[i] + " ");
        }
        return strBuilder.toString().trim();
    }
}