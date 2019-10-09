/**
 * @program: designmode
 * @description: 矩形
 * @author: steven
 * @create: 2019-10-09 22:27
 **/
package com.steven.designmode.simplefactory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
