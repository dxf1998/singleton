package com.zuoyang.singleton;

/**
 * 饿汉式：
 *  * 线程安全，在线程还出现以前就是创建了对象
 *
 */
public class SingLetonHungry  {
    private static  SingLetonHungry singLetonHungry = new SingLetonHungry();
   private SingLetonHungry(){}
   public static SingLetonHungry getInstance(){
       return singLetonHungry;
   }

}
