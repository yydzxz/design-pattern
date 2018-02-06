package com.company.proxy.java.dynamicProxy.demo1;

import com.company.proxy.java.dynamicProxy.demo1.DynamicProxyHandler;
import com.company.proxy.java.dynamicProxy.demo1.Interface;
import com.company.proxy.java.dynamicProxy.demo1.RealObject;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject=new RealObject();
        consumer(realObject);

        Interface proxy=(Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(realObject)
        );
        consumer(proxy);

    }
}
