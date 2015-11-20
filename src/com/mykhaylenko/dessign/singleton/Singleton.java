package com.mykhaylenko.dessign.singleton;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}
