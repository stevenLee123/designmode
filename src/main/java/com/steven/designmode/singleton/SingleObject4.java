/**
 * @program: designmode
 * @description: 多重检查机制实现懒汉式
 *  volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。禁止进行指令重排序。
 * @author: steven
 * @create: 2019-10-10 08:09
 **/
package com.steven.designmode.singleton;

public class SingleObject4 {
    // 使用volatile关键字
    private static volatile SingleObject4 singleObject4;
    private SingleObject4(){

    }
    public  static SingleObject4 getInstance(){
        if(null != singleObject4) {
            return  singleObject4;
        }
        synchronized (SingleObject4.class){
            if(null == singleObject4) {
                singleObject4 = new SingleObject4();
            }
        }
        return singleObject4;
    }
    public void showMessage(){
        System.out.println("hello world");
    }
}
