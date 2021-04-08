package com.gp.algorithm.db;

/**
 *
 * 剑指 Offer 46. 把数字翻译成字符串
 *
 * @Author theone
 * @Date 2020/10/31 23:43
 * @Version 1.0
 */
public class TranslateNum {
    public int translateNum(int num) {
        if(num<2){
            return 1;
        }
        String str = String.valueOf(num);
        char []s = str.toCharArray();
        int[] dp = new int[s.length];
        dp[0] = 1;
        for (int i = 1; i < s.length; i++) {
            int n = Integer.parseInt(str.substring(i-1,i+1));
            if(n<=25&i<2){
                dp[i] = dp[i-1]+1;
                continue;
            }
            if(n<=25&& n>=10){
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        return dp[s.length-1];
    }
}
