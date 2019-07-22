package com.zuoyang.singleton;

public class SingLetonStaticRun {
    public static void main(String[] args) {
        SingLetonStaticThread singLetonStaticThread1 = new SingLetonStaticThread();
        SingLetonStaticThread singLetonStaticThread2 = new SingLetonStaticThread();
        SingLetonStaticThread singLetonStaticThread3 = new SingLetonStaticThread();
        singLetonStaticThread1.start();
        singLetonStaticThread2.start();
        singLetonStaticThread3.start();
    }
}
