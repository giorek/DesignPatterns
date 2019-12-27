package com.iorek.designpatterns.V2.visitor;

public class Teacher implements Element {
    private String name;
    private int score;
    private int paperCount;

    public Teacher(String name, int score, int paperCount) {
        this.name = name;
        this.score = score;
        this.paperCount = paperCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    @Override
    public String toString() {
        return "{教师 name:"+name
                +" score:"+score
                +" paperCount:"+paperCount
                +"}";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
