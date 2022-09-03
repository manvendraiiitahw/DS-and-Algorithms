package advance.java.leetcode.subscription.neetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] s = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        EvaluateReversePolishNotation notation = new EvaluateReversePolishNotation();
        System.out.println(notation.evalRPN(s));
    }

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            boolean isOperator = isOperator(s);
            if (isOperator) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                int c = operation(s, a, b);
                stack.push(String.valueOf(c));
            }else{
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    public boolean isOperator(String s) {
        return s.equals("*") || s.equals("+") || s.equals("/") || s.equals("-");
    }

    public int operation(String s, int a, int b) {
        switch (s) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "/":
                return a / b;
            default:
                return a - b;
        }
    }
}
