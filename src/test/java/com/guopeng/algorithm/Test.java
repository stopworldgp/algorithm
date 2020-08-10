package com.guopeng.algorithm;

import com.github.rholder.retry.*;
import com.google.common.base.Predicates;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author jony.huang
 * @date 2020/6/4 15:43
 */

public class Test {

    public static void main(String[] args) {
//        int result = 0;
//        int n = 0;
//        for (int i = 0; i < 2; i++) {
//            result += 1 * Math.pow(10, n++);
//        }
        System.out.println(Integer.MAX_VALUE);
        long l = 9999999991L;
        System.out.println(9 + l);
        //定义重试机制
        Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
                .retryIfException()    //设置异常重试
                .retryIfResult(Predicates.equalTo(true))    //call方法返回true重试
                .withWaitStrategy(WaitStrategies.fixedWait(10, TimeUnit.SECONDS))   //设置10秒后重试
                .withStopStrategy(StopStrategies.stopAfterAttempt(3)).build();  //设置重试次数 超过将出异常
        Callable callable = null;
        try {
            retryer.call(callable);
        } catch (RetryException | ExecutionException e) {
            // 重试失败 后续操作
            // ...
            e.printStackTrace();
        }

    }
}
