package Recursion;

/**
 * 숫자 배열이 있는데 1개를 제외하고는 2개쌍으로 되어 있고, 정렬이 되어 있다.
 * ex) 1 2 2 3 3 -> 1, 4 4 5 5 6 6 9 10 10 -> 9
 */
public class 숫자배열중1개만존재하는숫자구하기 {
    public static void main(String[] args) {
        int[] input = new int[]{4, 4, 5, 5, 6, 6, 9, 10, 10};
//        int[] input = new int[]{1, 1, 2, 2};
        if (input.length % 2 == 0 || input.length < 3) {
            System.out.println("input err");
        } else {
            System.out.println(recursion(input, 0, input.length - 1));
        }
    }

    private static int recursion(int[] input, int start, int end) {
        int mid = start + (end - start) / 2;
        if (mid - 1 < 0 || mid + 1 > end)
            return -1;
        if (input[mid] != input[mid - 1] && input[mid] != input[mid + 1]) {
            return input[mid];
        }
        if (input[mid] == input[mid + 1]) {
            return recursion(input, mid + 1, end);
        }
        if (input[mid] == input[mid - 1]) {
            return recursion(input, start, mid - 1);
        }
        return -1;
    }
}
