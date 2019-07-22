package com.zuoyang.singleton;

public class SinLetonlLazyTwoTwoThread extends Thread {

    @Override
    public void run(){
        System.out.println(SinLetonLazyTwoTwo.getInstance().hashCode());
    }
}
