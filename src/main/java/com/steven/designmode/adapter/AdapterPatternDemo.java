/**
 * @program: designmode
 * @description: 设配器客户端
 * @author: steven
 * @create: 2019-10-10 23:17
 **/
package com.steven.designmode.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        ApplePlayer audioPlayer = new ApplePlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");


    }
}
