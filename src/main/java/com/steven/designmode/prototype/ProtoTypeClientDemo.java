/**
 * @program: designmode
 * @description: 原型模式客户端
 * @author: steven
 * @create: 2019-10-10 22:38
 **/
package com.steven.designmode.prototype;

public class ProtoTypeClientDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShapeMap().get("1");
        // 克隆出来的对象不是同一个对象
        System.out.println(shape1);
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape);
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());


    }
}
