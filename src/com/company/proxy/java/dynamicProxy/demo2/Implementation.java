package com.company.proxy.java.dynamicProxy.demo2;

public class Implementation implements SomeMethods {
    @Override
    public void boring() {
        System.out.println("boring");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting:"+arg);
    }
}
