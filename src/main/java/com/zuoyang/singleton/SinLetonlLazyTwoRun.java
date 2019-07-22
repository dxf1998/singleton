package com.zuoyang.singleton;

public class SinLetonlLazyTwoRun {
    public static void main(String[] args) {
        SinLetonlLazyTwoThread sinLetonlLazyTwoThread1 = new SinLetonlLazyTwoThread();
        SinLetonlLazyTwoThread sinLetonlLazyTwoThread2 = new SinLetonlLazyTwoThread();
        SinLetonlLazyTwoThread sinLetonlLazyTwoThread3 = new SinLetonlLazyTwoThread();
        sinLetonlLazyTwoThread1.start();
        sinLetonlLazyTwoThread2.start();
        sinLetonlLazyTwoThread3.start();
    }
}
