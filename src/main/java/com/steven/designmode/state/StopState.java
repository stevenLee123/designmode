/**
 * @author Steven
 * @create 2019/10/12 17:00
 * @Description:
 */
package com.steven.designmode.state;

public class StopState implements State{
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
