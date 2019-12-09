package com.iorek.designpatterns.V2.prototype;

public class InnerProduct {
    public String innerName;
    public int innerPrice;

    public InnerProduct(){

    }

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName;
    }

    public int getInnerPrice() {
        return innerPrice;
    }

    public void setInnerPrice(int innerPrice) {
        this.innerPrice = innerPrice;
    }

    @Override
    public String toString() {
        return "inner product innerName:"+innerName+" innerPrice:"+innerPrice;
    }
}
