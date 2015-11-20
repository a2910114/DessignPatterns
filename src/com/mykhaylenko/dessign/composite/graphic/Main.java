package com.mykhaylenko.dessign.composite.graphic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Main {

    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        graphic1.addGraphic(ellipse);
        graphic1.addGraphic(ellipse2);

        graphic2.addGraphic(ellipse3);
        graphic2.addGraphic(ellipse4);

        graphic.addGraphic(graphic1);
        graphic.addGraphic(graphic2);

        graphic.print();



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-YYYY");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 326);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

    }

}
