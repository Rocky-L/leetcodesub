public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operators = new Stack<Integer>();
        int divide = 0, substract = 0;

        if(tokens.length == 0) { return 0; }

        for (String token: tokens) {
            if (token.equals("+")) {
                operators.push(operators.pop() + operators.pop());
            } else if (token.equals("-")) {
                substract = operators.pop();
                operators.push(operators.pop() - substract);
            } else if (token.equals("*")) {
                operators.push(operators.pop() * operators.pop());
            } else if (token.equals("/")) {
                divisor = operators.pop();
                operators.push(operators.pop() / divide);
            } else {
                operators.push(Integer.parseInt(token));
            }
        }
        return operators.pop();
    }
}