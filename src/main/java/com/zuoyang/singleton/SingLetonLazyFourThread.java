package com.zuoyang.singleton;

public class SingLetonLazyFourThread extends Thread {
    @Override
    public void run(){
        System.out.println(SingLetonLazyFour.getInstance().hashCode());
    }
}
