package com.solvd.homework3.hierarchy;

import com.solvd.homework3.interfaces.*;

import java.util.Objects;

public class Desktop extends Computer implements Shutdown, Run, CapsLock, CapsUnlock, Temperature {

    private int fans;
    private String caseColor;
    private boolean wifiAntenna;
    private String graphicCard;

    public Desktop() {
    }

    public Desktop(String processor, int memory, int diskCapacity, int fans, String caseColor, boolean wifiAntenna, String graphicCard) {
        super(processor, memory, diskCapacity);
        this.fans = fans;
        this.caseColor = caseColor;
        this.wifiAntenna = wifiAntenna;
        this.graphicCard = graphicCard;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public boolean isWifiAntenna() {
        return wifiAntenna;
    }

    public void setWifiAntenna(boolean wifiAntenna) {
        this.wifiAntenna = wifiAntenna;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }



    @Override
    public String toString() {
        return "Desktop{" +
                "fans=" + fans +
                ", caseColor='" + caseColor + '\'' +
                ", wifiAntenna=" + wifiAntenna +
                ", graphicCard='" + graphicCard + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desktop desktop = (Desktop) o;
        return fans == desktop.fans && wifiAntenna == desktop.wifiAntenna && Objects.equals(caseColor, desktop.caseColor) && Objects.equals(graphicCard, desktop.graphicCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fans, caseColor, wifiAntenna, graphicCard);
    }


    public void run(String program) {
            System.out.println("Executing " + program);
    }

    public void boot() {
        System.out.println("Welcome to desktop pc");
    }

    public void shutdown() {
        System.out.println("Shutting down desktop pc");
    }

    public void capsLock(){
        System.out.println("UPPERCASE INPUT ENABLED");
    }

    public void capsUnlock(){
        System.out.println("uppercase input disabled");
    }

    public void temperature(){
        System.out.println("The CPU temperature is 35°C");
    }


    @Override
    public void run() {
        
    }
}
