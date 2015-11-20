package com.mykhaylenko.dessign.factory;

import com.mykhaylenko.dessign.factory.factory.ShapeFactory;
import com.mykhaylenko.dessign.factory.shape.ShapeType;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();
        factory.createShape(ShapeType.CIRCLE).drow();
        factory.createShape(ShapeType.TRIANGLE).drow();
        factory.createShape(ShapeType.SQUARE).drow();

    }
}
