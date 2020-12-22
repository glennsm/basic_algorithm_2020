package Recursion;

public class Fibonacci {
    public int fib(int n) {
        if (n < 2) return n;
        return memo(n);
    }

    private int memo(int n) {
        int[] cache = new int[n + 1];
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
