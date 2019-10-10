/**
 * @program: designmode
 * @description: 内部静态类实现懒汉式,静态内部类的加载与外部类加载无关
 * @author: steven
 * @create: 2019-10-10 08:01
 **/
package com.steven.designmode.singleton;

public class SingleObject3 {
    //提供静态内部类持有当前类的静态final属性
    private static class SingletonClassInstance{
        // 获取静态变量不会进行初始化
        public SingletonClassInstance(){
            System.out.println("init inner class");
        }
        private static final SingleObject3 instance = new SingleObject3();
    }
    //私有化构造方法
    private SingleObject3(){

    }
    //提供访问接口
    public static SingleObject3 getInstance(){
        return SingletonClassInstance.instance;
    }
    public void showMessage(){
        System.out.println("hello world");
    }
}
