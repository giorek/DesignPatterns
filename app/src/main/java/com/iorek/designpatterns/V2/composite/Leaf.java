package com.iorek.designpatterns.V2.composite;

import com.iorek.designpatterns.Util.Logger;

/**
 * 具体子类实现父类方法
 */
public class Leaf extends Component {
    private static String TAG = Leaf.class.getSimpleName();
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        Logger.I(TAG," add ");
    }

    @Override
    public void remove(Component component) {
        Logger.I(TAG," remove ");
    }

    @Override
    public void display() {
        Logger.I(TAG," desplay "+name);
    }
}
