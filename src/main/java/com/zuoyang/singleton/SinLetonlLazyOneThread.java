package com.zuoyang.singleton;

public class SinLetonlLazyOneThread extends Thread {

    @Override
    public void run(){
        System.out.println(SinLetonLazyOne.getInstance().hashCode());
    }
}
