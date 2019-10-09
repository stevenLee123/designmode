/**
 * @program: designmode
 * @description: 正方形
 * @author: steven
 * @create: 2019-10-09 22:27
 **/
package com.steven.designmode.simplefactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
