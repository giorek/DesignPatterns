package com.iorek.designpatterns.V2.visitor;

public interface Element {
    void accept(Visitor visitor);
}
