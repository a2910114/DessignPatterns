package com.mykhaylenko.dessign.bridge.shape.impl;

import com.mykhaylenko.dessign.bridge.draw.DrawApi;
import com.mykhaylenko.dessign.bridge.shape.Shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Circle extends Shape {

    private int radius;
    private int x;
    private int y;

    public Circle(DrawApi drawApi, int radius, int x, int y) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
