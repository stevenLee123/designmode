/**
 * @program: designmode
 * @description: vlc播放器
 * @author: steven
 * @create: 2019-10-10 23:05
 **/
package com.steven.designmode.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);


    }

    @Override
    public void playMp4(String fileName) {

    }
}
