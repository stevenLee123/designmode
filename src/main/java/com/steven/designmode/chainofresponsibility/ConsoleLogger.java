/**
 * @author Steven
 * @create 2019/10/12 9:19
 * @Description: 处理器实现1
 */
package com.steven.designmode.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
