package com.zuoyang.singleton;

public class SinLetonlLazyThreeThread extends Thread {

    @Override
    public void run(){
        System.out.println(SinLetonLazyThree.getInstance().hashCode());
    }
}
