/**
 * @author Steven
 * @create 2019/10/10 20:16
 * @Description: 冷饮
 */
package com.steven.designmode.builder;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();


}
