/**
 * @author Steven
 * @create 2019/10/10 20:19
 * @Description: 汉堡类具体实现
 */
package com.steven.designmode.builder;

public class VegBurger extends Burger{
    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 25.0f;
    }
}
