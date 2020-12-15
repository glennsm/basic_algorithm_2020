package Sort;

public class Select {
    public static void main(String[] args) {
        int[] n = new int[]{5,2,7,1,23,6,99,20};
        for( int i: n){
            System.out.print(i+", ");
        }
        System.out.println("");
        selectionSortRecursion(n);
        for( int i: n){
            System.out.print(i+", ");
        }
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
