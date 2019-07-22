package com.zuoyang.singleton;

/**
 * 基于加锁的线程安全的懒汉式单例
 */
public class SinLetonLazyTwo {

    private static SinLetonLazyTwo sinLetonLazyTwo;

    private SinLetonLazyTwo() {
    }

    //加锁 来保证多线程的情况下也是一个单例
    synchronized public static SinLetonLazyTwo getInstance() {
        try {
            if (sinLetonLazyTwo != null) {
            } else {
                Thread.sleep(3000);
                sinLetonLazyTwo = new SinLetonLazyTwo();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sinLetonLazyTwo;
    }
}
