package com.solvd.homework3.hierarchy;

import com.solvd.homework3.hierarchy.Computer;

import java.util.Objects;

public class Desktop extends Computer {

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


}
