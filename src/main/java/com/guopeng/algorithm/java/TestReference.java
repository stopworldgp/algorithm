package com.guopeng.algorithm.java;

import java.util.Stack;

/**
 *
 * jvm 引用
 * 强引用: Object o = new Object()
 * 软引用: 在内存要溢出时进行清理 SoftReference
 * 弱引用: 活到下一次的垃圾回收
 * 虚引用: 最弱的引用，唯一目的是能在这个对象被回收时收到一个系统通知。jdk1.2以后通过PhantomReference实现
 *
 * @author jony.huang
 * @date 2020/9/24 19:24
 */
public class TestReference {

    public static void main(String[] args) {
        int target = 10;
        System.out.println(target/2);
        System.out.println((target-1)/2);

    }

}
