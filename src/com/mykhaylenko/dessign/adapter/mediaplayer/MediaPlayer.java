package com.mykhaylenko.dessign.adapter.mediaplayer;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public interface MediaPlayer {

    /**
     * By default play only Mp3 files
      * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
