package com.zuoyang.singleton;

public class SingLetonLazyFour {

    private  SingLetonLazyFour(){}

    private static class SingLetonFourHandler{
        private static SingLetonLazyFour sinLetonLazyFour = new SingLetonLazyFour();
    }

    public static SingLetonLazyFour getInstance(){
        return SingLetonFourHandler.sinLetonLazyFour;
    }



}
