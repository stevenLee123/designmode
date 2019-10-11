/**
 * @program: designmode
 * @description: 桥接模式客户端
 * @author: steven
 * @create: 2019-10-11 07:54
 **/
package com.steven.designmode.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
