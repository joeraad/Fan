package com.fan;
import com.util.*;

public class Fan implements FanInterface {
    private final Speed speed;
    private final Rotation rotation;

    public Fan() {
        System.out.println("Created Fan Object");
        this.speed = new Speed(3, true);
        this.rotation = new Rotation();
    }

    public int getSpeed() {
        return this.speed.getSpeed();
    }

    public void pullSpeedCord() {
        System.out.println("Pulled Speed Cord");
        this.speed.increaseSpeed();
    }

    public void pullDirectionCord() {
        System.out.println("Pulled Direction Cord");
        this.rotation.reverseRotation();
    }

    @Override
    public String toString() {
        if (speed.getSpeed() == 0) {
            return "Fan is turned off";
        }
        return "Fan speed: " + this.speed + ", Fan direction: " + (rotation.isClockwise() ? "clockwise" : "counter-clockwise");
    }
}
