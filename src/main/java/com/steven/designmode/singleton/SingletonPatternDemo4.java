/**
 * @program: designmode
 * @description: 双重检查锁机制
 * @author: steven
 * @create: 2019-10-10 08:15
 **/
package com.steven.designmode.singleton;

public class SingletonPatternDemo4 {
    public static void main(String[] args) {
        SingleObject4 singleObject4 = SingleObject4.getInstance();
        singleObject4.showMessage();
    }
}
