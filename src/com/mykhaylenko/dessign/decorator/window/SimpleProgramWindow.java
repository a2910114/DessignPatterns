package com.mykhaylenko.dessign.decorator.window;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class SimpleProgramWindow implements ProgramWindow{

    @Override
    public void draw() {
        System.out.println("Simple program widow draw");
    }

    @Override
    public String getDescription() {
        return "Simple program window description";
    }
}
