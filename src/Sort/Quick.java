package Sort;

public class Quick {
    public static void main(String[] args) {
        int[] n = new int[]{5,2,7,1,23,6,99,20};
        for( int i: n){
            System.out.print(i+", ");
        }
        System.out.println("");
        quick(n);
        for( int i: n){
            System.out.print(i+", ");
        }
    }

    private static void quick(int[] data) {
        if (data.length < 2) {
            return;
        }

        int pivotIndex = data.length / 2;
        int pivotValue = data[pivotIndex];

        int leftCount = 0;

        //피벗보다 작은 원소 개수 세기
        for (int i = 0; i < data.length; i++) {
            if (data[i] < pivotValue)
                ++leftCount;
        }

        int[] left = new int[leftCount];
        int[] right = new int[data.length - leftCount - 1];
        int l = 0;
        int r = 0;

        for (int i = 0; i < data.length; i++) {
            if (i == pivotIndex) continue;

            int val = data[i];
            if(val < pivotValue){
                left[l++] = val;
            } else {
                right[r++] = val;
            }
        }

        quick(left);
        quick(right);

        System.arraycopy(left, 0, data, 0, left.length);
        data[left.length] = pivotValue;
        System.arraycopy(right, 0, data, left.length+1, right.length);
    }
}
