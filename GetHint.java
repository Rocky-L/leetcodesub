public class Solution {
    public String getHint(String secret, String guess) {
        int countA = 0, countB = 0, cowIndex = 0;
        char[] secretArray = secret.toCharArray(), guessArray = guess.toCharArray();
        for (int i = 0; i < secretArray.length; i++) {
            if (secretArray[i] == guessArray[i]) {
                countA++;
                secretArray[i] = 'a';
                guessArray[i] = 'c';
            }
        }

        for (int i = 0; i < guessArray.length; i++) {
            for(int j = 0; j < secretArray.length; j++) {
                if(guessArray[i] == secretArray[j]) {
                    countB++;
                    secretArray[j] = 'b';
                    guessArray[i] = 'c';
                }
            }
        }
        return countA + "A" + countB + "B";
    }
}