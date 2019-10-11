/**
 * @author Steven
 * @create 2019/10/11 17:21
 * @Description: 抽象装饰类
 */
package com.steven.designmode.decorator;

public abstract  class ShapeDecorator {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
