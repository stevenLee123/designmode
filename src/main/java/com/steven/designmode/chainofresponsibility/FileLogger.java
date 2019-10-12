/**
 * @author Steven
 * @create 2019/10/12 9:21
 * @Description: 处理器实现3
 */
package com.steven.designmode.chainofresponsibility;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
