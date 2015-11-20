package com.mykhaylenko.dessign.adapter.mediaplayer.impl;

import com.mykhaylenko.dessign.adapter.adapter.MediaAdapter;
import com.mykhaylenko.dessign.adapter.mediaplayer.MediaPlayer;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Mp3 file is playing. Name: " + fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid file format");
        }

    }
}
