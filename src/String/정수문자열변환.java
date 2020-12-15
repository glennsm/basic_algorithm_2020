package String;

public class 정수문자열변환 {
    public static void main(String[] args) {
        String numberStr = "0";

        System.out.println("convertStringToInt");
        int number = convertStringToInt(numberStr);
        System.out.println(number);
        System.out.println("convertIntToString");
        System.out.println(convertIntToString(number));

    }

    private static int convertStringToInt(String numberStr) {
        int i = 0;
        int result = 0;
        boolean minus = false;

        if (numberStr.charAt(0) == '-') {
            minus = true;
            i++;
        }

        while (i < numberStr.length()) {
            result *= 10;
            result += numberStr.charAt(i++) - '0';
        }

        if (minus) {
            result = result * -1;
        }

        return result;
    }

    private static String convertIntToString(int number) {
        int i = 0;
        final int MAX_CHAR = 10;
        char[] temp = new char[MAX_CHAR + 1];
        boolean minus = false;
        if (number < 0) {
            number = -number;
            minus = true;
        }

        do {
            temp[i++] = (char) ((number % 10) + '0');
            number = number / 10;
        } while (number > 0);

        StringBuilder sb = new StringBuilder();
        if (minus) {
            sb.append("-");
        }
        while (i > 0) {
            sb.append(temp[--i]);
        }

        return sb.toString();
    }
}
