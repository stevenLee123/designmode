/**
 * @program: designmode
 * @description: 外观模式客户端
 * @author: steven
 * @create: 2019-10-11 20:58
 **/
package com.steven.designmode.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
