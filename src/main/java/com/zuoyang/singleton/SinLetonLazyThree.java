package com.zuoyang.singleton;

/**
 * 基于双重检查锁的机制实现的单例模式
 */
public class SinLetonLazyThree {

    private static SinLetonLazyThree sinLetonLazyTwoOne;

    private SinLetonLazyThree() {
    }

    //加锁 来保证多线程的情况下也是一个单例

    public static SinLetonLazyThree getInstance() {
        try {
//存在多个线程，跑进来在这里
            if (sinLetonLazyTwoOne != null) {
            } else {
                Thread.sleep(3000);
                //后面进来的线程需要判断lazy是否已经初始化了，不然的话，会重新创建新的对象
                synchronized (SinLetonLazyThree.class) {
                    if (sinLetonLazyTwoOne == null)
                        sinLetonLazyTwoOne = new SinLetonLazyThree();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sinLetonLazyTwoOne;
    }
}
