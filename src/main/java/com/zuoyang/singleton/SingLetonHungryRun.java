package com.zuoyang.singleton;

public class SingLetonHungryRun {
    public static void main(String[] args) {
        SingLetonHungryThread singLetonHungryThread1 = new SingLetonHungryThread();
        SingLetonHungryThread singLetonHungryThread2 = new SingLetonHungryThread();
        SingLetonHungryThread singLetonHungryThread3 = new SingLetonHungryThread();
        singLetonHungryThread1.start();
        singLetonHungryThread2.start();
        singLetonHungryThread3.start();
    }
}
