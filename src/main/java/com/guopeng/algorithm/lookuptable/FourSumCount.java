package com.guopeng.algorithm.lookuptable;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 * <p>
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 * <p>
 * 例如:
 * <p>
 * 输入:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 * <p>
 * 输出:
 * <p>
 * 2
 * <p>
 * 解释:
 * 两个元组如下:
 * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 *
 * @author jony.huang
 * @date 2020/6/6 11:47
 */
public class FourSumCount {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer, Integer> mapAB = new HashMap<>();
        //1.mapAB
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int ab = A[i] + B[j];
                if (mapAB.containsKey(ab)) {
                    mapAB.put(ab, mapAB.get(ab) + 1);
                } else {
                    mapAB.put(ab, 1);
                }
            }
        }

        //2.MapCD
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int cd = C[i] + D[j];
                if (mapAB.containsKey(0 - cd)) {
                    count = count + mapAB.get(0 - cd);
                }
            }
        }
        return count;
    }

}
