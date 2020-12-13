package String;

import java.util.HashMap;
import java.util.Scanner;

/**
 * total -> o
 * teeter -> r
 */
public class 반복되지않는첫번째문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("input : " + input);

        System.out.println("반복되지 않는 첫번째 문자는 : " + firstNonRepeated2(input));
    }

    private static Character firstNonRepeated1(String str) {
        HashMap<Character, Integer> charHash = new HashMap<>();
        int i, length;
        Character c;

        length = str.length();
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (charHash.containsKey(c)) {
                charHash.put(c, charHash.get(c) + 1);
            } else {
                charHash.put(c, 1);
            }
        }

        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (charHash.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    private static Character firstNonRepeated2(String str) {
        HashMap<Character, Object> map = new HashMap<>();
        int i, length;
        Character c;
        Object once = new Object();
        Object multi = new Object();

        length = str.length();
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, multi);
            } else {
                map.put(c, once);
            }
        }

        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (map.get(c) == once) {
                return c;
            }
        }
        return null;
    }
}
