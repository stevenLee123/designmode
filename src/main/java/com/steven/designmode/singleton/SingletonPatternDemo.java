/**
 * @program: designmode
 * @description: 饿汉式客户端
 * @author: steven
 * @create: 2019-10-10 07:41
 **/
package com.steven.designmode.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }


}
