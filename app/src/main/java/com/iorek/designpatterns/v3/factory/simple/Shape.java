package com.iorek.designpatterns.v3.factory.simple;

public abstract class Shape {
    public abstract void draw();
    public abstract void erase();
    public static Shape factory(String type){
        if(type.equals("A")){
            return new Circle();
        }else if(type.equals("B"))
        {
            return new Rect();
        }else{
            try {
                throw new Exception("Invalid type Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
