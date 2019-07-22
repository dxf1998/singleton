package com.zuoyang.singleton;

public class SinLetonlLazyOneThreadTest extends Thread {

    @Override
    public void run(){
        System.out.println(SinLetonLazyOneTest.getInstance().hashCode());
    }
}
