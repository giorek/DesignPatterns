package com.iorek.designpatterns.V2.proxy;

import com.iorek.designpatterns.Util.Logger;

public class RealSubject1 implements SubjectInterface {
    private static String TAG = RealSubject1.class.getSimpleName();
    private String name;
    public RealSubject1(String name){
        this.name = name;
    }
    @Override
    public void subjectMethod1() {
        Logger.I(TAG+" "+name+" subjectMethod1 call");
    }

    @Override
    public void subjectMethod2() {
        Logger.I(TAG+" "+name+" subjectMethod2 call");
    }
}
