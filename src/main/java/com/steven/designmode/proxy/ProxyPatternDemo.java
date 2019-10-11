/**
 * @program: designmode
 * @description: 代理模式客户端
 * @author: steven
 * @create: 2019-10-12 07:42
 **/
package com.steven.designmode.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
