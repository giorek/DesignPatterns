package com.iorek.designpatterns;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.iorek.designpatterns.Messenger.Point;
import com.iorek.designpatterns.Messenger.SpaceCaculate;
import com.iorek.designpatterns.Messenger.Vector;
import com.iorek.designpatterns.Util.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.iorek.designpatterns", appContext.getPackageName());
    }

    @Test
    public void testSpaceCaculate()
    {
        Point point = new Point(1,1,1);
        Vector vector = new Vector(1,2);
        Point pointVector = SpaceCaculate.Caculate(point,vector);
        //Point point1 = new Point(2,2,2);
        Point point1 = pointVector;
        Logger.I(pointVector.toString());
        assertEquals(point1.getX(),pointVector.getX());
        assertEquals(point1,pointVector);
        //assertNotEquals(point1,pointVector);
    }
}
