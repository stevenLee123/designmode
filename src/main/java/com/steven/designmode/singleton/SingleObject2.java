/**
 * @program: designmode
 * @description: 懒汉式
 * @author: steven
 * @create: 2019-10-10 07:42
 **/
package com.steven.designmode.singleton;

public class SingleObject2 {
    // 静态属性不初始化
    private static SingleObject2 singleObject2;

    // 私有化构造器
    private SingleObject2(){

    }
    //使用synchronized 保证线程安全
    public static synchronized SingleObject2 getInstance(){
        if(null == singleObject2) {
            singleObject2 = new SingleObject2();
        }
        return  singleObject2;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }

}
