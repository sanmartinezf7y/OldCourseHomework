package com.solvd.homework4.hierarchy;

import com.solvd.homework4.interfaces.*;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.logging.Logger;

public class Laptop extends Computer implements ICharge {
    private final static Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

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
        LOGGER.info("System overheating; shutting down");
   }


    public void boot() {
        LOGGER.info("Welcome to laptop");
    }

    public void shutdown() {
        LOGGER.info("Shutting down laptop");
    }

    public void charge(){
        LOGGER.info("Charging battery");
    }

    public void run(String program) {
        LOGGER.info("Executing " + program);
    }

    public void capsLock(){
        LOGGER.info("UPPERCASE INPUT ENABLED");
    }

    public void capsUnlock(){
        LOGGER.info("uppercase input disabled");
    }

    public void temperature(){
        LOGGER.info("The CPU temperature is 75°C");
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
