package com.zuoyang.singleton;

/**
 * 基于加锁的线程不安全的懒汉式单例
 */
public class SinLetonLazyTwoTwo {

    private static SinLetonLazyTwoTwo sinLetonLazyTwoOne;

    private SinLetonLazyTwoTwo() {
    }

    //加锁 来保证多线程的情况下也是一个单例

    public static SinLetonLazyTwoTwo getInstance() {
        try {

            if (sinLetonLazyTwoOne != null) {
            } else {
                Thread.sleep(3000);
                synchronized (SinLetonLazyTwoTwo.class) {
                    sinLetonLazyTwoOne = new SinLetonLazyTwoTwo();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sinLetonLazyTwoOne;
    }
}
