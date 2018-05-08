package com.iorek.designpatterns.Messenger;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x,int y,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(Point point)
    {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point x:"+x+" y:"+y+" z:"+z;
    }
}
