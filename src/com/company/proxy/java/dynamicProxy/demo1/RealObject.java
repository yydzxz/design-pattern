package com.company.proxy.java.dynamicProxy;

public class RealObject implements Interface{

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String thing) {
        System.out.println("somethingElse:"+thing);
    }
}
