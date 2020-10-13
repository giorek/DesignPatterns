package com.iorek.designpatterns.v3.generic;

public class GenericClaz<T> {
    public T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <T> T caculate(){
        return (T) value;
    }

    public <T,E> E tst(){
        return null;
    }
}
