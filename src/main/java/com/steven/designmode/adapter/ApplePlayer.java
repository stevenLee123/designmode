/**
 * @program: designmode
 * @description: MediaPlayer具体实现类
 * @author: steven
 * @create: 2019-10-10 23:15
 **/
package com.steven.designmode.adapter;

public class ApplePlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {

        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }


    }
}
