/**
 * @author Steven
 * @create 2019/10/12 17:01
 * @Description: 状态模式客户端
 */
package com.steven.designmode.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
