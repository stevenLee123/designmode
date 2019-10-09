/**
 * @program: designmode
 * @description: 蓝色
 * @author: steven
 * @create: 2019-10-09 22:42
 **/
package com.steven.designmode.abstractfactory;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside blue::fill() method.");
    }
}
