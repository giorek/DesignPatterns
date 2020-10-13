package com.iorek.designpatterns.v3.generic;

public interface IGeneric<T> {
    void setValue(T type);
    T getValue();
}
