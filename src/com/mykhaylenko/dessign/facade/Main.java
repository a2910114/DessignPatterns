package com.mykhaylenko.dessign.facade;

import com.mykhaylenko.dessign.facade.facade.ComputerFacade;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class Main {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
