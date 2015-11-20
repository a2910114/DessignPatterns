package com.mykhaylenko.dessign.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 10/6/2015.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i);
                throw new NullPointerException();
            } catch (NullPointerException e) {
                System.out.println("catch");
            }
        }
    }
}
