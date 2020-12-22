package Bit;

public class 십진수2진수변환 {
    public static void main(String[] args) {
        int n = 13;
        print10(n);
        System.out.println("");
        lib(n);
    }

    private static void print10(int n) {
        if (n == 0) System.out.println(n);
        int[] arr = new int[32];

        int i = 0;
        while (n != 1) {
            arr[i++] = n % 2;
            n = n / 2;
        }
        arr[i] = n;

        for (int j = i; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }

    private static void lib(int n){
        System.out.println(Integer.toBinaryString(n));
    }
}
