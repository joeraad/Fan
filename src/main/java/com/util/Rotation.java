package com.util;

public class Rotation {
    private boolean clockwise;

    public Rotation() {
        this.clockwise = true;
    }

    public boolean isClockwise() {
        return clockwise;
    }

    public void setClockwise(boolean clockwise) {
        this.clockwise = clockwise;
    }

    public void reverseRotation() {
        System.out.println("Reversing Rotation. Current Rotation: "+ (this.clockwise ? "clockwise" : "counter-clockwise"));
        this.clockwise = !this.clockwise;
        System.out.println("Reversed Rotation. Current Rotation: "+ (this.clockwise ? "clockwise" : "counter-clockwise"));

    }
}
