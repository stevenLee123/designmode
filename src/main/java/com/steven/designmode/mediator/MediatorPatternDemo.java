/**
 * @author Steven
 * @create 2019/10/12 15:53
 * @Description: 中介者模式客户端
 */
package com.steven.designmode.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
