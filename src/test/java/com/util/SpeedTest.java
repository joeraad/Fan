package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTest {
    @Test
    void increaseSpeedWithLoopingOffAndLessThanMaxSpeed() {
        Speed speed = new Speed(3, false);
        int currentSpeed = speed.getSpeed();
        speed.increaseSpeed();
        int increasedSpeed = speed.getSpeed();
        assert (currentSpeed < increasedSpeed);
    }

    @Test
    void increaseSpeedWithLoopingOffAndAtMaxSpeed() {
        Speed speed = new Speed(4, false);
        speed.setSpeed(speed.getMaxSpeed());
        int currentSpeed = speed.getSpeed();
        speed.increaseSpeed();
        int increasedSpeed = speed.getSpeed();
        assert (currentSpeed == increasedSpeed);
    }

    @Test
    void increaseSpeedWithLoopingOnAndLessThanMaxSpeed() {
        Speed speed = new Speed(5, true);
        int currentSpeed = speed.getSpeed();
        speed.increaseSpeed();
        int increasedSpeed = speed.getSpeed();
        assert (currentSpeed < increasedSpeed);
    }

    @Test
    void increaseSpeedWithLoopingOnAndAtMaxSpeed() {
        Speed speed = new Speed(4, true);
        speed.setSpeed(speed.getMaxSpeed());
        speed.increaseSpeed();
        int increasedSpeed = speed.getSpeed();
        assert (increasedSpeed == 0);
    }

    @Test
    void decreaseSpeedWhileAbove0() {
        Speed speed = new Speed(4, false);
        speed.setSpeed(3);
        int currentSpeed = speed.getSpeed();
        speed.decreaseSpeed();
        int decreasedSpeed = speed.getSpeed();
        assert (currentSpeed > decreasedSpeed);
    }

    @Test
    void decreaseSpeedWhileAt0() {
        Speed speed = new Speed(4, false);
        speed.setSpeed(0);
        speed.decreaseSpeed();
        int decreasedSpeed = speed.getSpeed();
        assert (decreasedSpeed == 0);
    }
}