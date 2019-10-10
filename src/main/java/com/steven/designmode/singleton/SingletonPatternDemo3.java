/**
 * @program: designmode
 * @description: 静态内部类实现客户端
 * @author: steven
 * @create: 2019-10-10 08:03
 **/
package com.steven.designmode.singleton;

public class SingletonPatternDemo3 {
    public static void main(String[] args) {
        SingleObject3 singleObject3 = SingleObject3.getInstance();
        singleObject3.showMessage();
    }
}
