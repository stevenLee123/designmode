/**
 * @program: designmode
 * @description: 饿汉式
 * @author: steven
 * @create: 2019-10-10 07:40
 **/
package com.steven.designmode.singleton;

public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
