package com.zuoyang.singleton;

public class SingLetonLazyFourRun {
    public static void main(String[] args) {
        SingLetonLazyFourThread singLetonLazyFourThread1 = new SingLetonLazyFourThread();
        SingLetonLazyFourThread singLetonLazyFourThread2 = new SingLetonLazyFourThread();
        SingLetonLazyFourThread singLetonLazyFourThread3 = new SingLetonLazyFourThread();
        singLetonLazyFourThread1.start();
        singLetonLazyFourThread2.start();
        singLetonLazyFourThread3.start();
    }
}
