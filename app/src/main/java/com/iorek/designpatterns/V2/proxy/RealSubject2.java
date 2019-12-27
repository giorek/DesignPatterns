package com.iorek.designpatterns.V2.proxy;

import com.iorek.designpatterns.Util.Logger;

public class RealSubject2 implements SubjectInterface {
    private static final String TAG = RealSubject2.class.getSimpleName();
    private String name;
    public RealSubject2(String name){
        this.name = name;
    }

    @Override
    public void subjectMethod1() {
        Logger.I(TAG+" "+name+" subjectMethod1 called");
    }

    @Override
    public void subjectMethod2() {
        Logger.I(TAG+" "+name+" subjectMethod2 called");
    }
}
