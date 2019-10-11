/**
 * @program: designmode
 * @description: 桥实现者类2
 * @author: steven
 * @create: 2019-10-11 07:50
 **/
package com.steven.designmode.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");


    }
}
