/**
 * @program: designmode
 * @description: 懒汉式客户端
 * @author: steven
 * @create: 2019-10-10 07:47
 **/
package com.steven.designmode.singleton;

public class SingletonPatternDemo2 {
    public static void main(String[] args) {
        SingleObject2 singleObject2 = SingleObject2.getInstance();
        singleObject2.showMessage();
    }
}
