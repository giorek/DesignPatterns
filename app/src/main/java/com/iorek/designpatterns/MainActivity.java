package com.iorek.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iorek.designpatterns.DanamicProxy.DemoDanamic;
import com.iorek.designpatterns.DanamicProxy.DemoDanamicInterface;
import com.iorek.designpatterns.Factory.SimpleFactory.BMWENUM;
import com.iorek.designpatterns.Factory.SimpleFactory.SimpleFactory;
import com.iorek.designpatterns.ObjectDecoupling.Proxy.ProxyImplKlas;
import com.iorek.designpatterns.ObjectDecoupling.Proxy.ProxyImplKlasTwo;
import com.iorek.designpatterns.ObjectDecoupling.Proxy.ProxyKlas;
import com.iorek.designpatterns.Util.Logger;

public class MainActivity extends AppCompatActivity {
    private static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.I(TAG,"Hello java design pattern world!!!");

        //TestProxyModel();

        TestDanamicMethod();

        TestBmwFactory();
    }

    /**
     * 测试proxy模式
     * proxy类中包含一个实现类
     * proxy类与实现类共同实现了同一个接口
     * 调用proxy类的方法实际上实现的是实现类的方法
     */
    public void TestProxyModel()
    {
        //创建两个实现类
        ProxyImplKlas proxyImplKlas = new ProxyImplKlas();
        ProxyImplKlasTwo proxyImplKlasTwo = new ProxyImplKlasTwo();

        //创建两个代理，为每个代理类传递一个实现类
        ProxyKlas proxyKlasInstanceOne = new ProxyKlas(proxyImplKlas);
        ProxyKlas proxyKlasInstanceTwo = new ProxyKlas(proxyImplKlasTwo);

        //调用代理类的具体方法查看具体输出
        proxyKlasInstanceOne.BaseMethodOne();
        proxyKlasInstanceOne.BaseMethodTwo();

        proxyKlasInstanceTwo.BaseMethodOne();
        proxyKlasInstanceTwo.BaseMethodTwo();
    }

    public void TestDanamicMethod()
    {
        new DemoDanamic().DemoMethod();
    }

    public void TestBmwFactory()
    {
        new SimpleFactory().TellName(BMWENUM.BMW_LI);
        new SimpleFactory().TellName(BMWENUM.BMW_S);
    }
}
