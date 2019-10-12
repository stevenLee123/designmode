/**
 * @author Steven
 * @create 2019/10/12 14:55
 * @Description: 表达式接口
 */
package com.steven.designmode.interpreter;

public interface Expression {
    boolean interpret(String context);
}
