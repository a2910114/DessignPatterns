package com.mykhaylenko.dessign.decorator.decorator;

import com.mykhaylenko.dessign.decorator.window.ProgramWindow;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class VerticalScrollWindowDecorator extends WindowDecorator{

    public VerticalScrollWindowDecorator(ProgramWindow windowForDecoration) {
        super(windowForDecoration);
    }

    @Override
    public void draw() {
        super.draw();
        drawVerticalScrollBar();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " vertical scroll bars";
    }
    
    void drawVerticalScrollBar() {
        System.out.println("Drawing vertical scroll bar");
    }
}
