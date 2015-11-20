package com.mykhaylenko.dessign.factory.factory;

import com.mykhaylenko.dessign.factory.shape.Shape;
import com.mykhaylenko.dessign.factory.shape.ShapeType;
import com.mykhaylenko.dessign.factory.shape.impl.Circle;
import com.mykhaylenko.dessign.factory.shape.impl.Square;
import com.mykhaylenko.dessign.factory.shape.impl.Triangle;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class ShapeFactory {

    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }

        return instance;
    }

    public Shape createShape(ShapeType type) {

        switch (type) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case SQUARE:
                return new Square();
        }

        return null;
    }
}
