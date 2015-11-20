package com.mykhaylenko.dessign.adapter.adapter;

import com.mykhaylenko.dessign.adapter.mediaplayer.AdvancedMediaPlayer;
import com.mykhaylenko.dessign.adapter.mediaplayer.MediaPlayer;
import com.mykhaylenko.dessign.adapter.mediaplayer.impl.Mp4Player;
import com.mykhaylenko.dessign.adapter.mediaplayer.impl.VlcPlayer;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)){
            this.advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp4":
                advancedMediaPlayer.playMp4(fileName);
                break;
            case "vlc":
                advancedMediaPlayer.playVlc(fileName);
                break;
        }
    }
}
