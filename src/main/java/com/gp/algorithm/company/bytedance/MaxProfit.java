package com.gp.algorithm.company.bytedance;

/**
 * 题目：
 * 股票的最大利润
 * <p>
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * @Author theone
 * @Date 2020/10/11 19:50
 * @Version 1.0
 */
public class MaxProfit {

    public int findMaxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];
        //1.遍历
        for (int price : prices) {
            //2.计算 前几天的最小值
            minPrice = Math.min(minPrice, price);
            //3.计算最大利润比较
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

}
