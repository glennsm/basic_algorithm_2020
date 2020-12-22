package String;

import java.util.Arrays;
import java.util.Stack;

public class 스트링뒤집기 {
    public static void main(String[] args) {
        String input = "goods";
//        System.out.println(process(input));
        System.out.println(reverseString(input.toCharArray()));
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

    public static String reverseString(char[] s) {
        if(s == null) return null;
        char ch;
        for(int i=0; i<s.length/2; i++){
            ch = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = ch;
        }
        return new String(s);
    }
}
