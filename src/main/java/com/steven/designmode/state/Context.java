/**
 * @author Steven
 * @create 2019/10/12 16:57
 * @Description: 上下文类，持有当前类的状态
 */
package com.steven.designmode.state;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
