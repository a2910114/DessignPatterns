package com.mykhaylenko.dessign.prototype.cashe;

import com.mykhaylenko.dessign.prototype.shape.Circle;
import com.mykhaylenko.dessign.prototype.shape.Rectangle;
import com.mykhaylenko.dessign.prototype.shape.Shape;
import com.mykhaylenko.dessign.prototype.shape.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class ShapeCache {

    private static Map<Integer, Shape> shapeMap = new HashMap<>();

    static {
        Circle circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId(2);
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3);
        shapeMap.put(rectangle.getId(), rectangle);
    }

    public static Shape getShape(int id) throws CloneNotSupportedException {
        Shape cashedShape = shapeMap.get(id);
        return (Shape) cashedShape.clone();
    }
}
