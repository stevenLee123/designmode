/**
 * @author Steven
 * @create 2019/10/12 10:29
 * @Description: 命令实现类1
 */
package com.steven.designmode.command;

public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
