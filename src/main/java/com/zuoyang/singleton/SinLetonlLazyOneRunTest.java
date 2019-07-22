package com.zuoyang.singleton;

public class SinLetonlLazyOneRunTest {
    public static void main(String[] args) {
        SinLetonlLazyOneThreadTest sinLetonlLazyOneThreadTest1 = new SinLetonlLazyOneThreadTest();
        SinLetonlLazyOneThreadTest sinLetonlLazyOneThreadTest2 = new SinLetonlLazyOneThreadTest();
        SinLetonlLazyOneThreadTest sinLetonlLazyOneThreadTest3 = new SinLetonlLazyOneThreadTest();
        sinLetonlLazyOneThreadTest1.start();
        sinLetonlLazyOneThreadTest2.start();
        sinLetonlLazyOneThreadTest3.start();
    }
}
