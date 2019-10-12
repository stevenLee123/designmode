/**
 * @author Steven
 * @create 2019/10/12 16:20
 * @Description: 被通知对象1
 */
package com.steven.designmode.observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
