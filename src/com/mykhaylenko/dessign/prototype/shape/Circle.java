package com.mykhaylenko.dessign.prototype.shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}
