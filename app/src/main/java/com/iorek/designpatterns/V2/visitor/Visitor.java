package com.iorek.designpatterns.V2.visitor;

public interface Visitor {
    void visit(Student element);
    void visit(Teacher element);
}
