package com.zuoyang.singleton;

public class SinLetonlLazyThreeRun {
    public static void main(String[] args) {
        SinLetonlLazyThreeThread sinLetonlLazyThreeThread1 = new SinLetonlLazyThreeThread();
        SinLetonlLazyThreeThread sinLetonlLazyThreeThread2 = new SinLetonlLazyThreeThread();
        SinLetonlLazyThreeThread sinLetonlLazyThreeThread3 = new SinLetonlLazyThreeThread();
        sinLetonlLazyThreeThread1.start();
        sinLetonlLazyThreeThread2.start();
        sinLetonlLazyThreeThread3.start();
    }
}
