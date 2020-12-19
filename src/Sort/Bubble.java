package Sort;

import java.util.Arrays;

/**
 * 버블정렬
 * 서로 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘
 * 시간복잡도 : o(n2), 공간복잡도 : o(n)
 * <p>
 * 장점
 * 제자리정렬, 안정정렬
 * <p>
 * 단점
 * 시간복잡도가 모두 o(n2)
 * swap연산이 많이 일어난다
 */
public class Bubble {
    public static void main(String[] args) {
        int[] n = new int[]{5, 2, 7, 1, 23, 6, 99, 20};
        System.out.println(Arrays.toString(n));

//        bubbleSortByLoop(n);
        bubbleSrotByRecursion(n, n.length);

        System.out.println(Arrays.toString(n));
    }

    private static void bubbleSrotByRecursion(int[] n, int size) {
        if (size == 1) return;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                swap(n, i, i+1);
            }
        }
        bubbleSrotByRecursion(n, size-1);

    }

    private static void bubbleSortByLoop(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 1; j < n.length - 1; j++) {
                if (n[j] < n[j - 1]) {
                    swap(n, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] input, int index1, int index2) {
        if (index1 != index2) {
            int temp;
            temp = input[index1];
            input[index1] = input[index2];
            input[index2] = temp;
        }
    }
}
