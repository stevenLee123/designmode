/**
 * @program: designmode
 * @description: 颜色工厂
 * @author: steven
 * @create: 2019-10-09 22:46
 **/
package com.steven.designmode.abstractfactory;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }



    @Override
    Shape getShape(String shape) {
        return null;
    }
}
