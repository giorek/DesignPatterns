package com.iorek.designpatterns.v3.factory.prototype;

import com.iorek.designpatterns.Util.Logger;

public class PrototypeTest{
    public void printInfo(){
        PrototypeMode mode = new PrototypeMode();
        mode.setName("原型测试。。。");
        PersonMode personMode = new PersonMode();
        personMode.setName("人员");
        personMode.setAge(10);
        mode.setPersonMode(personMode);
        try {
            PrototypeMode cloneMode = (PrototypeMode) mode.clone();

            Logger.I("mode:"+mode.toString()+" cloneMode:"+cloneMode.toString());
            Logger.I("mode:"+mode.getName()+" cloneMode:"+cloneMode.getName());
            Logger.I("mode:"+mode.hashCode()+" cloneMode:"+cloneMode.hashCode());
            Logger.I("mode:"+mode.getPersonMode().getName()+" cloneMode:"+cloneMode.getPersonMode().getName());
            Logger.I("mode:"+mode.getPersonMode().hashCode()+" cloneMode:"+cloneMode.getPersonMode().hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
