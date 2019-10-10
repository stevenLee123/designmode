/**
 * @author Steven
 * @create 2019/10/10 20:22
 * @Description: 冷饮实现类2
 */
package com.steven.designmode.builder;

public class Pepsi extends ColdDrink {
    public String name() {
        return "Pepsi";
    }

    public float price() {
        return 35.0f;
    }
}
