package com.zuoyang.singleton;

public class SingLetonStatic {
    private static  SingLetonStatic singLetonStatic =null;

    private SingLetonStatic(){}

    static {
        singLetonStatic = new SingLetonStatic();
    }

    public static SingLetonStatic getInstance() {
        return singLetonStatic;
    }
}
