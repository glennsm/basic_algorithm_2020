package Sort;

import static Sort.Insert.insertSort;

/**
 * best, worst, average 모두 o(nlog(n))
 * o(n)수준의 메모리가필요
 *
 */
public class Merge {
    public static void main(String[] args) {
        int[] n = new int[]{5,2,7,1,23,6,99,20};
        for( int i: n){
            System.out.print(i+", ");
        }
        System.out.println("");
        mergeSortSimple(n);
        for( int i: n){
            System.out.print(i+", ");
        }
    }

    private static void mergeSortSimple(int[] data) {
//        if (data.length < 2) {
//            return;
//        }
        //어떤 정해진 크키보다 작은 부분배열을 다른 알고리즘으로 정렬하는 방식, 혼합형 합치기 정렬
        //삽입정렬 사용
        if (data.length < 10){
            insertSort(data);
        }

        //배열을 크기가 거의 같은 두개의 부분배열로 가른다.
        int mid = data.length / 2;
        int[] left = new int[mid];
        int[] right = new int[data.length - mid];

        System.arraycopy(data, 0, left, 0, left.length);
        System.arraycopy(data, mid, right, 0, right.length);

        mergeSortSimple(left);
        mergeSortSimple(right);

        merge(data, left, right);
    }

    private static void merge(int[] dest, int[] left, int[] right) {
        int dind = 0;
        int lind = 0;
        int rind = 0;

        //양쪽에 모두 원소가 있는 상태에서 배열을 합침
        while (lind < left.length && rind < right.length) {
            if (left[lind] <= right[rind]) {
                dest[dind++] = left[lind++];
            } else {
                dest[dind++] = right[rind++];
            }
        }

        while (lind < left.length) {
            dest[dind++] = left[lind++];
        }

        while (rind < right.length) {
            dest[dind++] = right[rind++];
        }
    }
}
