/**
 * @author Steven
 * @create 2019/10/12 16:26
 * @Description: 被通知对象3
 */
package com.steven.designmode.observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
