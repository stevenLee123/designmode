/**
 * @program: designmode
 * @description: 内部组件实现类2
 * @author: steven
 * @create: 2019-10-11 20:56
 **/
package com.steven.designmode.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
