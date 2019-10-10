/**
 * @program: designmode
 * @description: mp3播放器
 * @author: steven
 * @create: 2019-10-10 23:06
 **/
package com.steven.designmode.adapter;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
