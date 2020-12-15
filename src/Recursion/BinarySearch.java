package Recursion;

/**
 * 정렬된 정수배열에서 특정값의 인덱스를 찾는 함수 구현
 * 1 2 5 12 24 29 31 -> 29 : 5
 */
public class BinarySearch {
    public static void main(String[] args) {
        int target = 29;
        int[] arr = new int[]{1, 2, 5, 12, 24, 29, 31, 41};
//        int[] arr = new int[]{41,2};
//        System.out.println(recursion(arr, 0, arr.length - 1, target));
        System.out.println(roof(arr, target));
    }

    private static int recursion(int[] arr, int start, int end, int value) {
        int length = end - start;
        if (length < 0)
            return -1;
        if( arr[end] < arr[start])
            return -1;

        int mid = start + length / 2;
        if (arr[mid] == value)
            return mid;

        if (arr[mid] < value) {
            return recursion(arr, mid + 1, end, value);
        } else if (arr[mid] > value) {
            return recursion(arr, start, mid - 1, value);
        }
        return -1;
    }

    private static int roof(int[] input, int value) {
        int start = 0;
        int end = input.length - 1;
        int mid = 0;

        if (input[end] < input[start])
            return -1;

        while (true) {
            mid = start + (end - start) / 2;
            if (input[mid] == value) {
                return mid;
            }
            if(input[mid] < value){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
