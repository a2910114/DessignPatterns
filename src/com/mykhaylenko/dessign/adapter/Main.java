package com.mykhaylenko.dessign.adapter;

import com.mykhaylenko.dessign.adapter.mediaplayer.MediaPlayer;
import com.mykhaylenko.dessign.adapter.mediaplayer.impl.AudioPlayer;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Main {

    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.play("mp3", "la");
        player.play("mp4", "la la");
        player.play("vlc", "la la la");
    }
}
