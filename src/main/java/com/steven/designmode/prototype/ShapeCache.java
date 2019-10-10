/**
 * @program: designmode
 * @description: 缓存类
 * @author: steven
 * @create: 2019-10-10 22:37
 **/
package com.steven.designmode.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Hashtable<String, Shape> getShapeMap() {
        return shapeMap;
    }

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }


}
