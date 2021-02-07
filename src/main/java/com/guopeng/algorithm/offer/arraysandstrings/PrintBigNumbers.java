package com.guopeng.algorithm.offer.arraysandstrings;

/**
 * 来源：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/solution/mian-shi-ti-17-da-yin-cong-1-dao-zui-da-de-n-wei-2/
 * 题目：剑指 Offer 17. 打印从1到最大的n位数
 * 解题思路：采用遍历循环的思想，n位就是n次循环。
 *
 * @author jony.huang
 * @date 2021/2/7 16:40
 */
public class PrintBigNumbers {

    int n = 0;
    StringBuilder s = new StringBuilder();
    char[] loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    ;
    char[] num;

    public String printNumbers(int n) {
        //1.指定一次循环到几结束
        this.n = n;
        //2.初始化遍历数组大小
        num = new char[n];
        dfs(0);
        s.deleteCharAt(s.length() - 1);
        return s.toString();
    }

    /**
     * 循环
     *
     * @param x
     */
    private void dfs(int x) {
        if (x == n) {
            s.append(new String(num) + ',');
            return;
        }
        for (char c : loop) {
            num[x] = c;
            //开启下一个循环
            dfs(x + 1);
        }
    }
}
