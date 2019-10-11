/**
 * @author Steven
 * @create 2019/10/11 17:20
 * @Description: 被装饰类
 */
package com.steven.designmode.decorator;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
