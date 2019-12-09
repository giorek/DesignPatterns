package com.iorek.designpatterns.V2.adapter;

public class ClientAdapter {
    public void testAdapter(){
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        adapter.show();
    }
}
