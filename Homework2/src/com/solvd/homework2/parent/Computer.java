package com.solvd.homework2.parent;

import java.util.Objects;

public abstract class Computer {

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

    public abstract void boot();

    public abstract void shutdown();

    public void run() {
        System.out.println("Executing unspecified program");
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
