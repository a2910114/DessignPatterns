package com.mykhaylenko.dessign.factory.shape.impl;

import com.mykhaylenko.dessign.factory.shape.Shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class Triangle implements Shape {
    @Override
    public void drow() {
        System.out.println("Drow of triangle");
    }
}
