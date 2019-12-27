package com.iorek.designpatterns.V2.proxy;

public class SubjectProxy implements SubjectInterface {
    private static String TAG = SubjectProxy.class.getSimpleName();
    private SubjectInterface subjectInstance;

    public SubjectProxy(){
        subjectInstance = new RealSubject1("default");
    }

    public void setProxyObj(SubjectInterface proxyObj){
        subjectInstance = proxyObj;
    }

    @Override
    public void subjectMethod1() {
        subjectInstance.subjectMethod1();
    }

    @Override
    public void subjectMethod2() {
        subjectInstance.subjectMethod2();
    }
}
