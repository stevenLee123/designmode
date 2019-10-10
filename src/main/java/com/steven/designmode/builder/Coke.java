/**
 * @author Steven
 * @create 2019/10/10 20:21
 * @Description: 冷饮实现类1
 */
package com.steven.designmode.builder;

public class Coke extends ColdDrink {
    public String name() {
        return "coke";
    }

    public float price() {
        return 30.0f;
    }
}
