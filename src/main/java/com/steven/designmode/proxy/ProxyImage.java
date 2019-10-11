/**
 * @program: designmode
 * @description: 代理对象
 * @author: steven
 * @create: 2019-10-12 07:40
 **/
package com.steven.designmode.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
