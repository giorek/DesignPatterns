package com.iorek.designpatterns.v3.refacting;

import android.content.Intent;

import com.iorek.designpatterns.Util.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefactClient {
    public void test(){
        try {
            Logger.I(" RefactClient call:"+int.class.getCanonicalName());
            Class claz = Class.forName("java.lang");
            //Class claz = Intent.class;
            Constructor constructor = claz.getConstructor();
            Object obj = constructor.newInstance();

            Logger.I(" RefactClient:"+obj.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
