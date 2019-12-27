package com.iorek.designpatterns.V2.visitor;

public class Student implements Element {
    private String name;
    private float grade;
    private int paperCount;

    public Student(String name,float grade,int paperCount){
        this.name = name;
        this.grade = grade;
        this.paperCount = paperCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }


    @Override
    public String toString() {
        return "{学生 name:"+name
                +" grade:"+grade
                +" paperCount:"+paperCount
                +"}";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
