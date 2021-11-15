package com.solvd.homework4.hierarchy;

import com.solvd.homework4.interfaces.*;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.logging.Logger;

public abstract class Computer implements IShutdown, IRun, ICapsLock, ICapsUnlock, ITemperature, IBoot {
    private final static Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

    private String processor;
    private int memory;
    private int diskCapacity;

    public Computer() {
    }

    public Computer(String processor, int memory, int diskCapacity) {
        this.processor = processor;
        this.memory = memory;
        this.diskCapacity = diskCapacity;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(int diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public void temperature(){
        LOGGER.info("No computer specified to check");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory=" + memory +
                ", diskCapacity=" + diskCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return memory == computer.memory && diskCapacity == computer.diskCapacity && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, memory, diskCapacity);
    }

}
