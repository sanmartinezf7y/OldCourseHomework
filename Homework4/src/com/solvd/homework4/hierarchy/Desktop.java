package com.solvd.homework4.hierarchy;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.logging.Logger;

public class Desktop extends Computer {
    private final static Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

    private int fans;
    private String caseColor;
    private boolean wifiAntenna;
    private String graphicCard;
    public static int dtcount;

    public Desktop() {
    }

    public Desktop(String processor, int memory, int diskCapacity, int fans, String caseColor, boolean wifiAntenna, String graphicCard) {
        super(processor, memory, diskCapacity);
        this.fans = fans;
        this.caseColor = caseColor;
        this.wifiAntenna = wifiAntenna;
        this.graphicCard = graphicCard;
        dtcount++;
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
            LOGGER.info("Executing " + program);
    }

    public void boot() {
        LOGGER.info("Welcome to desktop pc");
    }

    public void shutdown() {
        LOGGER.info("Shutting down desktop pc");
    }

    public void capsLock(){
        LOGGER.info("UPPERCASE INPUT ENABLED");
    }

    public void capsUnlock(){
        LOGGER.info("uppercase input disabled");
    }

    public void temperature(){
        LOGGER.info("The CPU temperature is 35°C");
    }


    @Override
    public void run() {
        
    }
}
