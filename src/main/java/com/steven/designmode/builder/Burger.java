/**
 * @author Steven
 * @create 2019/10/10 20:13
 * @Description: 汉堡
 */
package com.steven.designmode.builder;

public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();

}
