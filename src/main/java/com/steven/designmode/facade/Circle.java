/**
 * @program: designmode
 * @description: 内部组件类实现3
 * @author: steven
 * @create: 2019-10-11 20:57
 **/
package com.steven.designmode.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
