/**
 * @program: designmode
 * @description: 持有桥类具体实现
 * @author: steven
 * @create: 2019-10-11 07:52
 **/
package com.steven.designmode.bridge;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle( int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
