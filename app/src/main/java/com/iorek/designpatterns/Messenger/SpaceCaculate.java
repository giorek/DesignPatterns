package com.iorek.designpatterns.Messenger;

import com.iorek.designpatterns.Util.Logger;

public class SpaceCaculate {
    public static Point Caculate(Point point,Vector vector)
    {
        Point point1 = new Point(point);
        point1.setX(point1.getX()+vector.getMagnitude());
        point1.setY(point1.getY()+vector.getMagnitude());
        point1.setZ(point1.getZ()+vector.getMagnitude());

        return point1;
    }
}
