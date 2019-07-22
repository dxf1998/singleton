package com.zuoyang.singleton;

/**
 *  懒汉式单例，但是多线程的情况下不安全
 */
public class SinLetonLazyOne {
    //静态块，公共内存区域
    private static SinLetonLazyOne sinLetonLazyOne;

    private SinLetonLazyOne(){
    }
    //调用方法之前，先判断
    //如果没有初始化，将其进行初始化,并且赋值
    //将该实例缓存好
    public static SinLetonLazyOne getInstance(){
        if (sinLetonLazyOne!=null) {

        }else {
            //两个线程都会进入这个if里面
             sinLetonLazyOne = new SinLetonLazyOne();
        }
        //如果已经初始化，直接返回之前已经保存好的结果
        return sinLetonLazyOne;
    }
}
