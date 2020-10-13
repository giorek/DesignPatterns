package com.iorek.designpatterns.v3.generic;

public class GenericConcrete<String> implements IGeneric {
    //private Object value;
    private String value;

    @Override
    public void setValue(Object type) {
        //value =  type;
    }

    @Override
    public Object getValue() {
        return null;
    }

    /*@Override
    public Object getValue() {
        return value;
    }*/

    /*@Override
    public Object getValue() {
        return value;
    }*/
}
