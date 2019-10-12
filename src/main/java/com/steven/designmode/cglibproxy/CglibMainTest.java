/**
 * @program: designmode
 * @description: cglib代理客户端
 * @author: steven
 * @create: 2019-10-12 08:00
 **/
package com.steven.designmode.cglibproxy;

public class CglibMainTest {
    public static void main(String[] args) {
        // 生成 Cglib 代理类
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        // 调用相关方法
        engineerProxy.eat();
    }
}
