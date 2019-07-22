package com.zuoyang.singleton;

public class SinLetonlLazyTwoTwoRun {
    public static void main(String[] args) {
        SinLetonlLazyTwoTwoThread sinLetonlLazyTwoTwoThread1 = new SinLetonlLazyTwoTwoThread();
        SinLetonlLazyTwoTwoThread sinLetonlLazyTwoTwoThread2 = new SinLetonlLazyTwoTwoThread();
        SinLetonlLazyTwoTwoThread sinLetonlLazyTwoTwoThread3 = new SinLetonlLazyTwoTwoThread();
        sinLetonlLazyTwoTwoThread1.start();
        sinLetonlLazyTwoTwoThread2.start();
        sinLetonlLazyTwoTwoThread3.start();
    }
}
