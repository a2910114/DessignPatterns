package com.mykhaylenko.dessign.bridge.shape;

import com.mykhaylenko.dessign.bridge.draw.DrawApi;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public abstract class Shape {

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
