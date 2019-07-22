package com.zuoyang.singleton;

public class SingLetonHungryThread extends Thread {
    @Override
    public void run(){
//        通过打印类的hashCode来确定是否为一个对象
        System.out.println(SingLetonHungry.getInstance().hashCode());
    }

}
