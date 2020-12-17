package String;

import java.util.Stack;

public class 스트링뒤집기 {
    public static void main(String[] args) {
        String input = "goods";
        System.out.println(process(input));
    }

    private static String process(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        char[] arr = input.toCharArray();

        Stack<Character> stack = new Stack<>();
        for( char ch : arr){
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
