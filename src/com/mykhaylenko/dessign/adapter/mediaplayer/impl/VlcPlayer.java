package com.mykhaylenko.dessign.adapter.mediaplayer.impl;

import com.mykhaylenko.dessign.adapter.mediaplayer.AdvancedMediaPlayer;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
