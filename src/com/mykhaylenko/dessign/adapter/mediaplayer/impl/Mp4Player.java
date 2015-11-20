package com.mykhaylenko.dessign.adapter.mediaplayer.impl;

import com.mykhaylenko.dessign.adapter.mediaplayer.AdvancedMediaPlayer;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}
