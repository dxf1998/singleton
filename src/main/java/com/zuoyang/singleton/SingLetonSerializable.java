package com.zuoyang.singleton;

import java.io.Serializable;

public class SingLetonSerializable implements Serializable {

    private SingLetonSerializable(){}

    private static class SingLetonSerializableHandler{
        private static final SingLetonSerializable singLetonSerializable  = new SingLetonSerializable();
    }

    public static SingLetonSerializable getInstance(){
        return SingLetonSerializableHandler.singLetonSerializable;
    }

    protected Object readResolve(){
        return SingLetonSerializableHandler.singLetonSerializable;
    }


}
