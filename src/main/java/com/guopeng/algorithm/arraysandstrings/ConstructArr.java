package com.guopeng.algorithm.arraysandstrings;

/**
 * @Author theone
 * @Date 2020/10/31 17:45
 * @Version 1.0
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        if(a==null||a.length==0){
            return new int[0];
        }
        int []b = new int[a.length];
        b[0]=1;
        int tmp =1;
        for (int i = 1; i < a.length; i++) {
            b[i]=b[i-1]*a[i-1];
        }
        for (int i =  a.length-2; i >=0 ; i--) {
            tmp*=a[i+1];
            b[i]*=tmp;
        }
        return b;
    }
}
