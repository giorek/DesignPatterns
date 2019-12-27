package com.iorek.designpatterns.V2.visitor;

import com.iorek.designpatterns.Util.Logger;

public class GradeSelection implements Visitor {

    @Override
    public void visit(Student element) {
        if(element.getGrade() >= 90){
            Logger.I(element.toString());
        }
    }

    @Override
    public void visit(Teacher element) {
        if(element.getScore() >= 85){
            Logger.I(element.toString());
        }
    }
}
