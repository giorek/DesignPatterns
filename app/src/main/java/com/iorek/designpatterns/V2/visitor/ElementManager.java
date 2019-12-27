package com.iorek.designpatterns.V2.visitor;

import com.iorek.designpatterns.Util.Logger;

import java.util.ArrayList;
import java.util.List;

public class ElementManager {
    private List<Element> list = new ArrayList<>();
    private static ElementManager instance = new ElementManager();
    private ElementManager(){

    }

    public static ElementManager getInstance(){
        return instance;
    }

    public void accept(Visitor visitor){
        for (Element ele:
             list) {
            ele.accept(visitor);
        }
    }

    public void addElement(Element element){
        if(!list.contains(element)){
            list.add(element);
        }
        printSize();
    }

    public void removeElement(Element element){
        if(list.contains(element)){
            list.remove(element);
        }
        printSize();
    }

    private void printSize(){
        Logger.I(" printSize size:"+toString());
    }

    @Override
    public String toString() {
        return "列表总大小"+list.size();
    }
}
