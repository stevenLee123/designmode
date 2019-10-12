/**
 * @author Steven
 * @create 2019/10/12 14:56
 * @Description: 表达式实现类
 */
package com.steven.designmode.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
