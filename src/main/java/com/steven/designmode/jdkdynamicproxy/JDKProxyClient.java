/**
 * @program: designmode
 * @description: jdk动态代理客户端
 * @author: steven
 * @create: 2019-10-12 07:50
 **/
package com.steven.designmode.jdkdynamicproxy;

import java.lang.reflect.Proxy;

public class JDKProxyClient {
    public static void main(String[] args) {
        //真实对象
        Subject realSubject =  new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();

        proxyClass.speak();
    }
}
