/**
 * @program: designmode
 * @description: 长方形
 * @author: steven
 * @create: 2019-10-10 22:33
 **/
package com.steven.designmode.prototype;

public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");


    }
}
