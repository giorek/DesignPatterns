package com.iorek.designpatterns.Factory.SimpleFactory;

import android.widget.Switch;

public class SimpleFactory {

    public void TellName(BMWENUM type)
    {
        switch (type)
        {
            case BMW_LI:
                new BMWLiProduct().TellName();
                break;
            case BMW_S:
                new BMWSuperProduct().TellName();
                break;
                default:
                    break;
        }
    }
}
