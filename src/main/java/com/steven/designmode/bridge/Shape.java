/**
 * @program: designmode
 * @description: 持有桥的抽象类
 * @author: steven
 * @create: 2019-10-11 07:51
 **/
package com.steven.designmode.bridge;

public abstract class Shape  {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
