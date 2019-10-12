/**
 * @author Steven
 * @create 2019/10/12 15:51
 * @Description: 聊天室作为最终资源
 */
package com.steven.designmode.mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
