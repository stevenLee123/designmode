/**
 * @author Steven
 * @create 2019/10/12 16:19
 * @Description:
 */
package com.steven.designmode.observer;

public  abstract class Observer {
    protected Subject subject;
    abstract void update();
}
