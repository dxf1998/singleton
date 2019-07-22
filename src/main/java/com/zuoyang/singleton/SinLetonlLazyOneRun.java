package com.zuoyang.singleton;

public class SinLetonlLazyOneRun {
    public static void main(String[] args) {
        SinLetonlLazyOneThread sinLetonlLazyOneThread1 = new SinLetonlLazyOneThread();
        SinLetonlLazyOneThread sinLetonlLazyOneThread2 = new SinLetonlLazyOneThread();
        SinLetonlLazyOneThread sinLetonlLazyOneThread3 = new SinLetonlLazyOneThread();
        sinLetonlLazyOneThread1.start();
        sinLetonlLazyOneThread2.start();
        sinLetonlLazyOneThread3.start();
    }
}
