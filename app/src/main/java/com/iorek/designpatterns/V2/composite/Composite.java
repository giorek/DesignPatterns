package com.iorek.designpatterns.V2.composite;

import com.iorek.designpatterns.Util.Logger;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private static String TAG = Composite.class.getSimpleName();
    private List<Component> compList = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        compList.add(component);
        Logger.I(TAG," add ");
    }

    @Override
    public void remove(Component component) {
        Logger.I(TAG," remove ");
        compList.remove(component);
    }

    @Override
    public void display() {
        Logger.I(TAG," display "+name);
        for (Component com:
             compList) {
            Logger.I(TAG," display each name:"+com.name);
        }
    }
}
