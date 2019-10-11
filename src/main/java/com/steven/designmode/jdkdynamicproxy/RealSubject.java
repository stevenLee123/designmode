/**
 * @program: designmode
 * @description: 被代理类
 * @author: steven
 * @create: 2019-10-12 07:45
 **/
package com.steven.designmode.jdkdynamicproxy;

public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1 ;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
