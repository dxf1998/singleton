package com.zuoyang.singleton;

public class SinLetonlLazyTwoOneRun {
    public static void main(String[] args) {
        SinLetonlLazyTwoOneThread sinLetonlLazyTwoOneThread1 = new SinLetonlLazyTwoOneThread();
        SinLetonlLazyTwoOneThread sinLetonlLazyTwoOneThread2 = new SinLetonlLazyTwoOneThread();
        SinLetonlLazyTwoOneThread sinLetonlLazyTwoOneThread3 = new SinLetonlLazyTwoOneThread();
        sinLetonlLazyTwoOneThread1.start();
        sinLetonlLazyTwoOneThread2.start();
        sinLetonlLazyTwoOneThread3.start();
    }
}
