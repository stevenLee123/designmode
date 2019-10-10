/**
 * @program: designmode
 * @description: 圆形
 * @author: steven
 * @create: 2019-10-10 22:36
 **/
package com.steven.designmode.prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
