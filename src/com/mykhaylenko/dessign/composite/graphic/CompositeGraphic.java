package com.mykhaylenko.dessign.composite.graphic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class CompositeGraphic implements Graphic {

    List<Graphic> graphics = new ArrayList<>();

    public void addGraphic(Graphic graphic){
        graphics.add(graphic);
    }

    @Override
    public void print() {
        graphics.stream().forEach(g -> g.print());
    }
}
