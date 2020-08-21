package com.iorek.designpatterns.v3.factory.dynamic;

import com.iorek.designpatterns.Util.Logger;

public class DyCircle implements DyShape{

    public static class Factory extends DyFactory{
        @Override
        public DyShape factory() {
            return new DyCircle();
        }
    }

    static {
        DyFactory.addFactory("A",new Factory());
    }

    @Override
    public void draw() {
        Logger.I("draw DyCircle called " +this.hashCode());
    }

    @Override
    public void erase() {
        Logger.I("erase DyCircle called");
    }
}
