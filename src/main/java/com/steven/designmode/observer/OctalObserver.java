/**
 * @author Steven
 * @create 2019/10/12 16:21
 * @Description: 被通知对象2
 */
package com.steven.designmode.observer;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
