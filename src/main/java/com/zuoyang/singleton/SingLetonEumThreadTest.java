package com.zuoyang.singleton;

public class SingLetonEumThreadTest extends Thread {
    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(SingLetonEumOne.getConnection().hashCode());
        }

    }
}
