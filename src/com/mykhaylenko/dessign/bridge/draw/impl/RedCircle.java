package com.mykhaylenko.dessign.bridge.draw.impl;

import com.mykhaylenko.dessign.bridge.draw.DrawApi;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Draw circle[color: red; radius: %d; x: %d; y: %d]\n", radius, x, y);
    }
}
