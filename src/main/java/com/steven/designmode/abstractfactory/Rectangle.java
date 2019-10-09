/**
 * @program: designmode
 * @description: 长方形
 * @author: steven
 * @create: 2019-10-09 22:40
 **/
package com.steven.designmode.abstractfactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
