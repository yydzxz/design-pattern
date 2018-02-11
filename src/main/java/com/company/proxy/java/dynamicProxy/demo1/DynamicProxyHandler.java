package com.company.proxy.java.dynamicProxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler{

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** proxy:"+proxy.getClass());
        System.out.println("*** method:"+method);
        System.out.println("*** args:"+args);
        if(args!=null){
            for (Object arg:args){
                System.out.println(" "+arg);
            }
        }
        return method.invoke(proxied,args);
    }
}
