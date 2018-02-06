package com.company.proxy.java.dynamicProxy;

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
