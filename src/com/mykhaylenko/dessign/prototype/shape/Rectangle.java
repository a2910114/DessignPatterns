package com.mykhaylenko.dessign.prototype.shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
}
