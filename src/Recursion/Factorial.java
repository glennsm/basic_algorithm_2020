package Recursion;

/**
 * 4! = 4 * (4-1)!
 * n! = n * (n-1)!
 * 0! = 1! = 1
 */
public class Factorial {
    public static void main(String[] args) {
        int i = 4;
//        System.out.println(factorialByRecursion(i));
//
//        for (int j : allFactorial(i)) {
//            System.out.print(j + " ");
//        }

        System.out.println(factorialByLoop(i));
    }

    private static int factorialByRecursion(int i) {
        if (i > 1) {
            // 재귀케이스
            return i * factorialByRecursion(i - 1);
        } else {
            // 기본케이스
            return 1;
        }
    }

    private static int[] allFactorial(int i) {
        int[] result = new int[i == 0 ? 1 : i];
        doFactorial(i, result, 0);
        return result;
    }

    private static int doFactorial(int i, int[] result, int level) {
        if (i > 1) {
            result[level] = i * doFactorial(i - 1, result, level + 1);
            return result[level];
        } else {
            result[level] = 1;
            return 1;
        }
    }

    private static int factorialByLoop(int n) {
        int val = 1;
        for (int i = 1; i <= n; i++) {
            val *= i;
        }
        return val;
    }
}
