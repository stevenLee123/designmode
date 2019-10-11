/**
 * @program: designmode
 * @description: 被代理接口实现类
 * @author: steven
 * @create: 2019-10-12 07:38
 **/
package com.steven.designmode.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
