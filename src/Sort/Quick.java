package Sort;

import java.util.Arrays;

/**
 * 퀵정렬은 분할정복방법을 통해 주어진 배열을 정렬한다
 * 분할정복은 문제를 2개의 문제로 분리하고 각각 해결한 다음, 결과를 모아서 원래의 문제를 해결하는 전략
 *
 * 불안정정렬, 비교정렬, merge sort와 달리 배열을 비균등하게 분할한다
 *
 * 시간복잡도
 * best, avg : o(nlogn)
 * worst : o(n2)
 *
 * 공간복잡도 : o(n)
 * 주어진 배열안에서 swap을 통해 정렬이 수행
 *
 * 장점
 * 정렬하고자 하는 배열안에서 교환하는 방식이므로 다른 메모리 공간을 필요하지 않는다.
 *
 * 단점
 * 불안정정렬이다
 * 이미 정렬된 배열에서는 불균현분할에 의해 오히려 수행시간이 더 많이 걸린다.
 *
 * 결론
 * 평균적으로 가장 빠른 정렬알고리즘, java에서 Arrays.sort() 내부적으로도 dual pivot quick sort로
 * 구현되어 있을 정도로 효율적인 알고리즘이다.
 */
public class Quick {
    public static void main(String[] args) {
        int[] n = new int[]{5,2,7,1,23,6,99,20};
        System.out.println(Arrays.toString(n));
//        quickFromBook(n);
        quick(n, 0, n.length-1);
        System.out.println(Arrays.toString(n));
    }

    private static void quick(int[] input, int left, int right){
        if(left >= right) return;

        int pivotIndex = partition(input, left, right);
        quick(input, left, pivotIndex-1);
        quick(input, pivotIndex+1, right);
    }

    private static int partition(int[] input, int left, int right) {
        //worse는 이미정렬된 경우 o(n2)를 회피하기위해
        int mid = (left + right) / 2;
        swap(input, left, mid);

        int pivotValue = input[left];
        int i = left;
        int j = right;

        while( i < j){
            while( pivotValue < input[j]){
                j--;
            }
            while( i < j && pivotValue >= input[i]){
                i++;
            }
            swap(input, i, j);
        }
        input[left] = input[i];
        input[i] = pivotValue;
        return i;
    }

    private static void swap(int[] input, int a, int b){
        if( a != b) {
            int temp = input[a];
            input[a] = input[b];
            input[b] = temp;
        }
    }

    //    private static void quickFromBook(int[] data) {
//        if (data.length < 2) {
//            return;
//        }
//
//        int pivotIndex = data.length / 2;
//        int pivotValue = data[pivotIndex];
//
//        int leftCount = 0;
//
//        //피벗보다 작은 원소 개수 세기
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] < pivotValue)
//                ++leftCount;
//        }
//
//        int[] left = new int[leftCount];
//        int[] right = new int[data.length - leftCount - 1];
//        int l = 0;
//        int r = 0;
//
//        for (int i = 0; i < data.length; i++) {
//            if (i == pivotIndex) continue;
//
//            int val = data[i];
//            if(val < pivotValue){
//                left[l++] = val;
//            } else {
//                right[r++] = val;
//            }
//        }
//
//        quickFromBook(left);
//        quickFromBook(right);
//
//        System.arraycopy(left, 0, data, 0, left.length);
//        data[left.length] = pivotValue;
//        System.arraycopy(right, 0, data, left.length+1, right.length);
//    }
}
