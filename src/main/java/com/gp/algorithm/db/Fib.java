package com.gp.algorithm.db;

/**
 * @Author theone
 * @Date 2020/10/31 18:15
 * @Version 1.0
 */
public class Fib {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fibDb(int n){
        int a=0;
        int b=1;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum = (a+b)% 1000000007;
            a =b;
            b = sum;
        }
      return a;
    }
}
