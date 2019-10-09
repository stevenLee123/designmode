/**
 * @program: designmode
 * @description: 圆形
 * @author: steven
 * @create: 2019-10-09 22:28
 **/
package com.steven.designmode.simplefactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
