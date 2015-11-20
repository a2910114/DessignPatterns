package com.mykhaylenko.dessign.bridge;

import com.mykhaylenko.dessign.bridge.draw.impl.GreenCircle;
import com.mykhaylenko.dessign.bridge.draw.impl.RedCircle;
import com.mykhaylenko.dessign.bridge.shape.Shape;
import com.mykhaylenko.dessign.bridge.shape.impl.Circle;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 10 ,10);
        Shape greenCircle = new Circle(new GreenCircle(), 10, 10 ,10);

        redCircle.draw();
        greenCircle.draw();
    }
}
