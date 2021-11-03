package com.solvd.homework2.sub2;

import com.solvd.homework2.parent.Computer;

import java.util.Objects;

public class Laptop extends Computer {

    private String keyboardLayout;
    private boolean webcam;
    private int screenSize;
    private int battery;

    public Laptop() {
    }

    public Laptop(String processor, int memory, int diskCapacity, String keyboardLayout, boolean webcam, int screenSize, int battery) {
        super(processor, memory, diskCapacity);
        this.keyboardLayout = keyboardLayout;
        this.webcam = webcam;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    public String getKeyboardLayout() {
        return keyboardLayout;
    }

    public void setKeyboardLayout(String keyboardLayout) {
        this.keyboardLayout = keyboardLayout;
    }

    public boolean isWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void charge(){
       System.out.println("Charging");
   }
   public void overheat(){
        System.out.println("System overheating; shutting down");
   }

    @Override
    public void boot() {
        System.out.println("Welcome");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down");
    }

    public void run(String program) {
        System.out.println("Executing " + program);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "keyboardLayout='" + keyboardLayout + '\'' +
                ", webcam=" + webcam +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return webcam == laptop.webcam && screenSize == laptop.screenSize && battery == laptop.battery && Objects.equals(keyboardLayout, laptop.keyboardLayout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), keyboardLayout, webcam, screenSize, battery);
    }
}
