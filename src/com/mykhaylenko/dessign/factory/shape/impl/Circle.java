package com.mykhaylenko.dessign.factory.shape.impl;

import com.mykhaylenko.dessign.factory.shape.Shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class Circle implements Shape {
    @Override
    public void drow() {
        System.out.println("drow of Circle");
    }
}
