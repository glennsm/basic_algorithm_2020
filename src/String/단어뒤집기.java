package String;

import java.util.Scanner;

/**
 * "best is good" => "good is best"
 */
public class 단어뒤집기 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("문자열을 입력해주세요.");
        StringBuilder sb = new StringBuilder();
//        sb.append(sc.nextLine());

        sb.append("good is best.");

        int length = sb.toString().split(" ").length;
        String[] arrStr = new String[length];
        for (String str : sb.toString().split(" ")) {
            arrStr[length - 1] = str + " ";
            length--;
        }
        StringBuilder result = new StringBuilder();
        for (String str : arrStr) {
            result.append(str);
        }
        result.setLength(result.length() - 1);
        System.out.println(result.toString());
    }
}
