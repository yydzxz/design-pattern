package com.company.proxy.java.dynamicProxy.demo1;

import com.company.proxy.java.dynamicProxy.demo1.Interface;

public class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String thing) {
        System.out.println("somethingElse:"+thing);
    }
}
