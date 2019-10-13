/**
 * @author Steven
 * @create 2019/10/13 10:04
 * @Description:
 */
package com.steven.designmode.strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}