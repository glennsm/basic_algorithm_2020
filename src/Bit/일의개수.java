package Bit;

public class 일의개수 {
    public static void main(String[] args) {
        int input = 7;
        System.out.println(shift(input));
        System.out.println(and(input));
    }

    private static int shift(int number) {
        int count = 0;
        while (number != 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number = number >>> 1;
        }
        return count;
    }

    private static int and(int number){
        int count = 0;
        while( number != 0 ) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }
}
