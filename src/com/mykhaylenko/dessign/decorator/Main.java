package com.mykhaylenko.dessign.decorator;

import com.mykhaylenko.dessign.decorator.decorator.VerticalScrollWindowDecorator;
import com.mykhaylenko.dessign.decorator.window.SimpleProgramWindow;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class Main {

    public static void main(String[] args) {
        SimpleProgramWindow simpleProgramWindow = new SimpleProgramWindow();

        VerticalScrollWindowDecorator decorator = new VerticalScrollWindowDecorator(simpleProgramWindow);

        decorator.draw();
        System.out.println(decorator.getDescription());
    }
}
