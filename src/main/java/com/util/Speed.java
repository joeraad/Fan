package com.util;

public class Speed {
    private int speed;
    private final int maxSpeed;
    private final boolean loopSpeed;

    public Speed(int maxSpeed, boolean loopSpeed) {
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.loopSpeed = loopSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isLoopSpeed() {
        return loopSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        System.out.format("Increasing speed. Current Speed: %d. Max Speed: %d. Is Looping: %b\n",this.speed,this.maxSpeed,this.loopSpeed);

        if (loopSpeed) {
            this.speed = (this.speed + 1) % (maxSpeed + 1);
        } else {
            if (speed < maxSpeed) {
                this.speed += 1;
            }
        }
        System.out.format("Increased speed. Current Speed: %d. Max Speed: %d. Is Looping: %b\n",this.speed,this.maxSpeed,this.loopSpeed);

    }

    public void decreaseSpeed() {
        if (this.speed > 0) {
            this.speed -= 1;
        } else {
            this.speed = 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.speed);
    }
}
