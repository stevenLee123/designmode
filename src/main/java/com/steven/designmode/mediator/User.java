/**
 * @author Steven
 * @create 2019/10/12 15:51
 * @Description: 用户作为中介
 */
package com.steven.designmode.mediator;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
