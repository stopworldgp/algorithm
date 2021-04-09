package com.gp.java.threadexecutor;

import java.util.concurrent.*;

/**
 * 来源：https://www.cnblogs.com/zincredible/p/10984459.html
 * 题目：jdk自带线程池
 * 解题思路：
 *
 * @author jony.huang
 * @date 2021/4/8 10:33
 */
public class JavaExecutors {

    public static void main(String[] args) {
        // 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。  [ˈskedʒuːld]
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        ExecutorService executorService3 = Executors.newCachedThreadPool();
        //创建一个可定期或者延时执行任务的定长线程池，支持定时及周期性任务执行。
        ScheduledExecutorService executorService4 = Executors.newScheduledThreadPool(5);
        //ThreadPoolExecutor 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2,
                60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10), new ThreadPoolExecutor.AbortPolicy());
        //修改参数
        threadPoolExecutor.setCorePoolSize(1);
        //修改队列长度
        threadPoolExecutor.getQueue();
    }

}
