package com.iorek.designpatterns.Messenger;

public class Vector {
    private int magnitude;
    private int direction;

    public Vector(int magnitude, int direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public int getDirection() {
        return direction;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
