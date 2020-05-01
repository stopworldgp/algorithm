package com.guopeng.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author theone
 * @Date 2020/4/27 0:46
 * @Version 1.0
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        if (n <= 0 || n <= 4 && n > 1) {
            return false;
        }
        while (n != 1) {
            String s = n + "";
            int reuslt = 0;
            for (int i = 0; i < s.length(); i++) {
                reuslt += (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
             n = reuslt;
            if (n == 4) {
                return false;
            }
        }
        return true;
    }
}
