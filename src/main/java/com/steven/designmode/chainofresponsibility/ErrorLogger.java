/**
 * @author Steven
 * @create 2019/10/12 9:20
 * @Description: 处理器实现2
 */
package com.steven.designmode.chainofresponsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
