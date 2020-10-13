package com.iorek.designpatterns.v3.observe;

import java.util.ArrayList;
import java.util.List;

public class MyObservableProxy implements MyObservable{
    private MyObservable myObservable;
    private List<Observe> observeList ;

    public MyObservableProxy(MyObservable observable){
        this.myObservable = observable;
        observeList = new ArrayList<>();
    }

    public void registObserve(Observe observe){
        if(!observeList.contains(observe)){
            observeList.add(observe);
        }
    }

    public void UnRegistObserve(Observe observe){
        if(observeList.contains(observe)){
            observeList.remove(observe);
        }
    }

    @Override
    public void notifyMessage() {
        //myObservable.notifyMessage();
        for(int i = 0 ; i < observeList.size();i++){
            observeList.get(i).Update();
        }
    }
}
