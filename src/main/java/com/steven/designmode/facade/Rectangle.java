/**
 * @program: designmode
 * @description: 组件实现类1
 * @author: steven
 * @create: 2019-10-11 20:55
 **/
package com.steven.designmode.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
