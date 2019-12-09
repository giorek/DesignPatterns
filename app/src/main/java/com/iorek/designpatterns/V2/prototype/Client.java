package com.iorek.designpatterns.V2.prototype;

import com.iorek.designpatterns.Util.Logger;

public class Client {
    public void testPrototype(){
        ProductMode mode = new ProductMode();
        mode.setName("模式1");
        mode.setPrice(100);
        InnerProduct innerProduct = new InnerProduct();
        innerProduct.setInnerName("内部名称");
        innerProduct.setInnerPrice(101);
        mode.setInnerProduct(innerProduct);

        Logger.I("model:"+mode.toString());

        try {
            ProductMode mode1 = (ProductMode)mode.clone();
            Logger.I(" model1: "+mode1.toString());

            Logger.I("if it equals ? "+mode.equals(mode1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
