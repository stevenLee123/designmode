/**
 * @program: designmode
 * @description: 工厂生成器
 * @author: steven
 * @create: 2019-10-09 22:47
 **/
package com.steven.designmode.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }


}
