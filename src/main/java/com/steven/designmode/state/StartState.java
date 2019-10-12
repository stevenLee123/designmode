/**
 * @author Steven
 * @create 2019/10/12 16:57
 * @Description: 烛台实现接口
 */
package com.steven.designmode.state;

public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
