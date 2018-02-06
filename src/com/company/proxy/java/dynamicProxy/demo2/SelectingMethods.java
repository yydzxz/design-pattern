package com.company.proxy.java.dynamicProxy.demo2;

import java.lang.reflect.Proxy;

public class SelectingMethods {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        //将生成的class文件保存到磁盘上
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        SomeMethods proxy=(SomeMethods) Proxy.newProxyInstance(
                SomeMethods.class.getClassLoader(),
                new Class[]{SomeMethods.class},
                new MethodSelector(new Implementation())
        );
        proxy.boring();
        proxy.boring2();
        proxy.interesting("aaa");
        proxy.boring3();
    }

}
