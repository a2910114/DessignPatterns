package com.mykhaylenko.dessign.prototype.shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square draw");
    }
}
