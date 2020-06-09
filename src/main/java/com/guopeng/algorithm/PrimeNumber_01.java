package com.guopeng.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 因为假设数m=p*q,且p≤q则m=p*q≥p*p即p≤√m所以m必有一个小于或等于其平方根的因数,
 * 那么验证素数时就只需要验证到其平方根就可以——这个证明通过数学的方式，证明了其中一个因数的取值范围是&lt;=√m的，这样才具有说服力。
 *
 * @author jony.huang
 * @date 2020/6/9 9:25
 */
public class PrimeNumber_01 {

    /**
     * 求从1到n 的素数集合
     *
     * @param n
     * @return
     */
    public static List<Integer> findPrime(int n) {
        List<Integer> list = new ArrayList<>();
        boolean sign = true;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0 && i != 2) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sign = false;
                    break;
                }
            }
            if (sign) {
                list.add(i);
                if (list.size() == 26) {
                    break;
                }
            }
            sign = true;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findPrime(200));
    }


}
