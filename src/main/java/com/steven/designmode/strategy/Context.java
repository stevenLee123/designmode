/**
 * @author Steven
 * @create 2019/10/13 10:05
 * @Description: 策略持有上下文
 */
package com.steven.designmode.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
