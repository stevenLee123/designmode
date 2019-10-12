/**
 * @author Steven
 * @create 2019/10/12 15:58
 * @Description: 保存类状态的备忘录类
 */
package com.steven.designmode.memento;

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
