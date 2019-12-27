package com.iorek.designpatterns.V2.decorate;

import com.iorek.designpatterns.Util.Logger;

public class ComponentImpl implements Component{
    @Override
    public void componentMethod() {
        Logger.I(" ComponentImpl componentMethod");
    }
}
