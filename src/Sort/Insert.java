package Sort;

/**
 * 한번에 한 원소씩 이미 정렬된 다른 원소들과 비교하여 새 원소를 제 위치에 삽입하는 식
 * best : 리스트가 이미 정렬되어 있을때 o(n)
 * 평균 & worst : o(n2)
 * 안정적인 제자리 정렬 알고리즘으로 소량의 데이터 집합을 처리할 때 강점
 */
public class Insert {
    public static void main(String[] args) {
        int[] n = new int[]{5,2,7,1,23,6,99,20};
        for( int i: n){
            System.out.print(i+", ");
        }
        System.out.println("");
        insertSort(n);
        for( int i: n){
            System.out.print(i+", ");
        }
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
