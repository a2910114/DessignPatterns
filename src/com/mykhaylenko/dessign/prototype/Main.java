package com.mykhaylenko.dessign.prototype;

import com.mykhaylenko.dessign.prototype.cashe.ShapeCache;
import com.mykhaylenko.dessign.prototype.shape.Shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Shape shape = ShapeCache.getShape(1);
        shape.draw();
    }
}
