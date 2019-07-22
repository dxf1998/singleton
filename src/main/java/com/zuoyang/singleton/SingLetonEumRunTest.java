package com.zuoyang.singleton;

public class SingLetonEumRunTest {
    public static void main(String[] args) {
        SingLetonEumThreadTest singLetonEumThreadTest1 = new SingLetonEumThreadTest();
        SingLetonEumThreadTest singLetonEumThreadTest2 = new SingLetonEumThreadTest();
        SingLetonEumThreadTest singLetonEumThreadTest3 = new SingLetonEumThreadTest();
        singLetonEumThreadTest1.start();
        singLetonEumThreadTest2.start();
        singLetonEumThreadTest3.start();
    }
}
