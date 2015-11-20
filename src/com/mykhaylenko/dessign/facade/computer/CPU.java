package com.mykhaylenko.dessign.facade.computer;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class CPU {

    public void freeze() {
        System.out.println("CPU is Frozen");
    }

    public void jump() {
        System.out.println("CPU is jump to some memory sector");
    }

    public void execute() {
        System.out.println("CPU executed");
    }
}
