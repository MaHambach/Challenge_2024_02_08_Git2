package org.github.mahambach;

public class Angle {
    private double value;
    private String unit; // Could be "degrees" or "radians"

    // Constructors
    public Angle(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    // Getters and setters
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    // Convert angle to radians
    public double toRadians() {
        if (unit.equalsIgnoreCase("degrees")) {
            return Math.toRadians(value);
        } else {
            return value;
        }
    }

    // Convert angle to degrees
    public double toDegrees() {
        if (unit.equalsIgnoreCase("radians")) {
            return Math.toDegrees(value);
        } else {
            return value;
        }
    }

    // Method to display information about the angle
    public void displayInfo() {
        System.out.println("Angle Value: " + value);
        System.out.println("Angle Unit: " + unit);
    }
}