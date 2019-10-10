/**
 * @author Steven
 * @create 2019/10/10 20:07
 * @Description: 商品接口
 */
package com.steven.designmode.builder;

public interface Item {
    String name();
    Packing packing();
    float price();
}
