/**
 * @program: designmode
 * @description: 外观类，持有所有组件
 * @author: steven
 * @create: 2019-10-11 20:58
 **/
package com.steven.designmode.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
