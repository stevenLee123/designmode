/**
 * @author Steven
 * @create 2019/10/10 20:20
 * @Description:汉堡具体实现类2
 */
package com.steven.designmode.builder;

public class ChickenBurger extends Burger {
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 50.5f;
    }
}
