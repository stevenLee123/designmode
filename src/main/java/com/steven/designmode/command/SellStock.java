/**
 * @author Steven
 * @create 2019/10/12 10:29
 * @Description: 命令实现类2
 */
package com.steven.designmode.command;


public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
