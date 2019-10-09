/**
 * @program: designmode
 * @description: 抽象工厂
 * @author: steven
 * @create: 2019-10-09 22:43
 **/
package com.steven.designmode.abstractfactory;

public abstract  class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;


}
