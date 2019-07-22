package com.zuoyang.singleton;

public class SinLetonlLazyTwoThread extends Thread {

    @Override
    public void run(){
        System.out.println(SinLetonLazyTwo.getInstance().hashCode());
    }
}
