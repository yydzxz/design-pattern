package com.company.proxy.java.dynamicProxy.demo2;

import com.company.proxy.java.dynamicProxy.demo1.Interface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodSelector implements InvocationHandler{

    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("interesting".equals(method.getName())){
            System.out.println("proxy detected the interesting method");
        }
        return method.invoke(proxied,args);
    }
}
