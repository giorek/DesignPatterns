package com.iorek.designpatterns.V2.decorate;

public class Decorate implements Component {
    private Component component;

    public Decorate(Component com)
    {
        component = com;
    }
    @Override
    public void componentMethod() {
        component.componentMethod();
    }
}
