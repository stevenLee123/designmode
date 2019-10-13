/**
 * @author Steven
 * @create 2019/10/13 10:03
 * @Description: 实现策略1
 */
package com.steven.designmode.strategy;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
