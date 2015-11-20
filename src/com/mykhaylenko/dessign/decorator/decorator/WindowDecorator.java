package com.mykhaylenko.dessign.decorator.decorator;

import com.mykhaylenko.dessign.decorator.window.ProgramWindow;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class WindowDecorator implements ProgramWindow {

    private ProgramWindow windowForDecoration;

    public WindowDecorator(ProgramWindow windowForDecoration) {
        this.windowForDecoration = windowForDecoration;
    }

    @Override
    public void draw() {
        windowForDecoration.draw();
    }

    @Override
    public String getDescription() {
        return windowForDecoration.getDescription();
    }
}
