package Sort;

import java.util.Arrays;

/**
 * 2번째 원소부터 시작하여 그앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후,
 * 원소들 뒤로 옮기고 지정된 자리에 자료를 삽입하여 정렬하는 알고리즘이다.
 * <p>
 * 한번에 한 원소씩 이미 정렬된 다른 원소들과 비교하여 새 원소를 제 위치에 삽입하는 식
 * <p>
 * 시작복잡도
 * best : 리스트가 이미 정렬되어 있을때 o(n)
 * 평균 & worst : o(n2)
 * <p>
 * 공간복잡도
 * o(n)
 * 안정적인 제자리 정렬 알고리즘으로 소량의 데이터 집합을 처리할 때 강점
 * <p>
 * 단점
 * 배열의 길이가 길어질수록 비효율
 */
public class Insert {
    public static void main(String[] args) {
        int[] n = new int[]{5, 2, 7, 1, 23, 6, 99, 20};
        System.out.println(Arrays.toString(n));
        System.out.println("");
        insertSort(n);
        System.out.println(Arrays.toString(n));
    }

    public static void insertSort(int[] data) {
        for (int which = 1; which < data.length; which++) {
            int val = data[which];
            for (int i = which - 1; i >= 0; i--) {
                if (data[i] > val) {
                    data[i + 1] = data[i];
                    data[i] = val;
                } else {
                    break;
                }
            }
        }
    }
}
