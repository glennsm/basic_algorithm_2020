package String;

import java.util.Scanner;

public class 특정문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원본문자열 입력 : ");
        String input = sc.nextLine();
        System.out.println("제거할문자열 입력 : ");
        String remove = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(input);

        System.out.println("결과 : " + removeChars(sb, remove));
    }

    private static String removeChars(StringBuilder str, String remove) {
        boolean[] flags = new boolean[128];
        int src, dst = 0;

        //삭제할 문자 플래그를 설정한다.
        for (char c : remove.toCharArray()) {
            flags[c] = true;
        }

        //모든 문자에 대해서 순환문을 돌리면서 플래그가 설정되지 않은 경우에만 복사
        for (src = 0; src < str.length(); src++) {
            char c = str.charAt(src);
            if (!flags[c]) {
                str.setCharAt(dst++, c);
            }
        }
        str.setLength(dst);
        return str.toString();
    }
}
