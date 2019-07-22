package com.zuoyang.singleton;

public class SinLetonlLazyTwoOneThread extends Thread {

    @Override
    public void run(){
        System.out.println(SinLetonLazyTwoOne.getInstance().hashCode());
    }
}
