package Sort;

import java.util.Arrays;

/**
 * 선택정렬
 * 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리
 * 시간복잡도 : o(n2), 공간복잡도 : o(n)즘
 *
 * 장점
 * bublle sort와 마찬가지로 단순하다
 * 정렬하고자 하느 ㄴ배열안에서 교환하는 방식이므로, 다른 메모리공간을 필요로 하지 않는다 => 제자리 정렬
 *
 * 단점
 * o(n2)
 * 불안정한 정렬이다 ex) 5(1),3,5(2),2 -> 2,3,5(2),5(1) 같은키인 5가 순서가 바뀔수잇다
 */
public class Select {
    public static void main(String[] args) {
        int[] n = new int[]{5, 2, 7, 1, 23, 6, 99, 20};
        System.out.println(Arrays.toString(n));
        selectionSortRecursion(n);
        System.out.println(Arrays.toString(n));
    }

    public static void selectionSortRecursion(int[] data) {
        selectionSortRecursive(data, 0);
    }

    private static void selectionSortRecursive(int[] data, int start) {
        if (start < data.length - 1) {
            swap(data, start, findMininumIndex(data, start));
            selectionSortRecursive(data, start + 1);
        }
    }

    private static void swap(int[] data, int index1, int index2) {
        if (index1 != index2) {
            int temp = data[index1];
            data[index1] = data[index2];
            data[index2] = temp;
        }
    }

    // 주어진 인덱스에서 시작하여 최소값을 가지는 위치를 찾아냄
    private static int findMininumIndex(int[] data, int start) {
        int min = start;

        for (int i = start + 1; i < data.length; i++) {
            if (data[i] < data[min]) {
                min = i;
            }
        }
        return min;
    }
}
