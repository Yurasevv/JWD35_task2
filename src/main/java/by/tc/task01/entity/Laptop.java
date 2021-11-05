package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private double cpu;
    private int memoryRom;
    private int systemMemory;
    private int displayInch;
    private String os;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, double cpu, int memoryRom, int systemMemory, int displayInch, String os) {
        this.batteryCapacity = batteryCapacity;
        this.cpu = cpu;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.displayInch = displayInch;
        this.os = os;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public int getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(int displayInch) {
        this.displayInch = displayInch;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 && Double.compare(laptop.cpu, cpu) == 0 && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && displayInch == laptop.displayInch && Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, cpu, memoryRom, systemMemory, displayInch, os);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", cpu=" + cpu +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", displayInch=" + displayInch +
                ", os='" + os + '\'' +
                '}';
    }
}
