package com.guopeng.algorithm.company.bytedance;

/**
 * 题目：
 * 有一个n边形(P0, P1, ..., Pn)， 每一条边皆为垂直或水平线段。现给定数值k，以P0为起点将n边形的周长分为k段，
 * 每段的长度相等，请打印出k等分点的坐标(T0, T1, ..., Tk）的坐标。
 * 思路：
 *
 * 1.先计算周长perimeter
 *
 * 2.根据k值，计算k段的长度为 perimeter/k = len
 *
 * 3.然后开始从P0计算每一个边都有哪些点
 *
 * 4.考虑一个边有多个 分割点情况
 * @Author theone
 * @Date 2020/10/11 15:34
 * @Version 1.0
 */
public class SplitPerimeter {

    public void split(Coordinate[] array, int k) {
        //0.校验
        if (array == null || array.length == 0) {
            return;
        }

        //1.计算周长 perimeter
        int perimeter = caltheCircumference(array);
        //2.求等长距离 perimeter / k = isometric
        int isometric = perimeter / k;
        //3.遍历各个边
        //3.1 设置临时存储长度 去补3.2出现的情况
        //每次的等长长度
        int len = isometric;
        for (int i = 1; i < array.length; i++) {
            Coordinate coordinate1 = array[i - 1];
            Coordinate coordinate2 = array[i];
            //累加base
            int base = 0;
            if (coordinate1.getX() == coordinate2.getX()) {
                int sideLength = Math.abs(coordinate1.getY() - coordinate2.getY());
                if (len < sideLength) {
                    while (len < sideLength) {
                        if (coordinate1.getY() < coordinate1.getY()) {
                            int y = coordinate1.getY() + len + base;
                            System.out.println(coordinate1.getX() + "," + y);
                        } else {
                            int y = coordinate2.getY() + len + base;
                            System.out.println(coordinate1.getX() + "," + y);
                        }
                        //每条边的累加计算
                        sideLength -= len;
                        base += len;
                        len = isometric;
                    }
                    len = len - sideLength;
                } else {
                    len -= sideLength;
                }
            } else {
                int sideLength = Math.abs(coordinate1.getX() - coordinate2.getX());
                if (len < sideLength) {
                    while (len < sideLength) {
                        if (coordinate1.getX() < coordinate1.getX()) {
                            int x = coordinate1.getX() + len + base;
                            System.out.println(x + "," + coordinate1.getY());
                        } else {
                            int x = coordinate2.getX() + len + base;
                            System.out.println(x + "," + coordinate1.getY());
                        }
                        sideLength -= len;
                        base += len;
                        len = isometric;
                    }
                    len = len - sideLength;
                } else {
                    len -= sideLength;
                }
            }
        }
    }

    /**
     * 计算周长
     *
     * @param array
     * @return
     */
    private int caltheCircumference(Coordinate[] array) {
        int perimeter = 0;
        for (int i = 0; i < array.length; i++) {
            int next = i + 1;
            // 如果最后一个顶点的话，需要计算和起点的距离
            if (i == array.length - 1) {
                next = 0;
            }
            Coordinate coordinate1 = array[i];
            Coordinate coordinate2 = array[next];
            if (coordinate1.getX() == coordinate2.getX()) {
                perimeter += Math.abs(coordinate1.getY() - coordinate2.getY());
            } else {
                perimeter += Math.abs(coordinate1.getX() - coordinate2.getX());
            }
        }
        return perimeter;
    }


    public static class Coordinate {
        private int x, y;

        public Coordinate(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "x = " + x + ", y=" + y;
        }
    }

}
