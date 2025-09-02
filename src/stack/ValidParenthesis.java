package stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args){
        if (isValid("[()]{(){}[]}")) System.out.print("Valid");
        else System.out.println("Invalid");
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if (c =='{') {
                stack.push('}');
            } else if (c=='(') {
                stack.push(')');
            } else if (c=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
