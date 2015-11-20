package com.mykhaylenko.dessign.facade.facade;

import com.mykhaylenko.dessign.facade.computer.CPU;
import com.mykhaylenko.dessign.facade.computer.HardDrive;
import com.mykhaylenko.dessign.facade.computer.RamMemory;

/**
 * Created by Pavlo.Mykhaylenko on 10/7/2015.
 */
public class ComputerFacade {
    
    private CPU cpu;
    private HardDrive hardDrive;
    private RamMemory ram;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.ram = new RamMemory();
    }

    public void start() {
        cpu.freeze();
        hardDrive.read();
        ram.load();
        cpu.jump();
        cpu.execute();
    }
}
