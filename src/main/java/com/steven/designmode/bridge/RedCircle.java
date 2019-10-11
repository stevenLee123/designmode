/**
 * @program: designmode
 * @description: 桥实现者类
 * @author: steven
 * @create: 2019-10-11 07:49
 **/
package com.steven.designmode.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");


    }
}
