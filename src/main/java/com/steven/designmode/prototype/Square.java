/**
 * @program: designmode
 * @description: 正方形
 * @author: steven
 * @create: 2019-10-10 22:35
 **/
package com.steven.designmode.prototype;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
