package com.zuoyang.singleton;

/**
 * 基于加锁的线程安全的懒汉式单例
 */
public class SinLetonLazyTwoOne {

    private static SinLetonLazyTwoOne sinLetonLazyTwoOne;

    private SinLetonLazyTwoOne() {
    }

    //加锁 来保证多线程的情况下也是一个单例

    public static SinLetonLazyTwoOne getInstance() {
        try {
            synchronized (SinLetonLazyTwoOne.class) {
                if (sinLetonLazyTwoOne != null) {
                } else {
                    Thread.sleep(3000);
                    sinLetonLazyTwoOne = new SinLetonLazyTwoOne();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sinLetonLazyTwoOne;
    }
}
