package com.zuoyang.singleton;

public class SingLetonEumRun {
    public static void main(String[] args) {
        SingLetonEumThread singLetonEumThread1 = new SingLetonEumThread();
        SingLetonEumThread singLetonEumThread2 = new SingLetonEumThread();
        SingLetonEumThread singLetonEumThread3 = new SingLetonEumThread();
        singLetonEumThread1.start();
        singLetonEumThread2.start();
        singLetonEumThread3.start();
    }
}
