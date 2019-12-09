package com.iorek.designpatterns.V2.prototype;

public class ProductMode implements  Cloneable{
    private static String TAG = ProductMode.class.getSimpleName();
    public String name;
    public int price;
    public InnerProduct innerProduct;

    public InnerProduct getInnerProduct() {
        return innerProduct;
    }

    public void setInnerProduct(InnerProduct innerProduct) {
        this.innerProduct = innerProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name:"+name+" price:"+price +" innerProduct:"+innerProduct.toString();
    }
}
