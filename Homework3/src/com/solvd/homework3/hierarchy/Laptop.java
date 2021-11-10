package com.solvd.homework3.hierarchy;

import com.solvd.homework3.hierarchy.Computer;

import java.util.Objects;

public class Laptop extends Computer implements boot, shutdown, run {

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


   public void overheat(){
        System.out.println("System overheating; shutting down");
   }


    public void boot() {
        System.out.println("Welcome to laptop");
    }

    public void shutdown() {
        System.out.println("Shutting down laptop");
    }

    public void charge(){
        System.out.println("Charging battery");
    }

    public void run(String program) {
        System.out.println("Executing " + program);
    }

    public void capsLock(){
        System.out.println("UPPERCASE INPUT ENABLED");
    }

    public void capsUnlock(){
        System.out.println("uppercase input disabled");
    }

    public void temperature(){
        System.out.println("The CPU temperature is 75°C");
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

    @Override
    public void run() {

    }
}
