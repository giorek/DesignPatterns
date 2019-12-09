package com.iorek.designpatterns;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.iorek.designpatterns.Collector.Collector;
import com.iorek.designpatterns.Collector.Filler;
import com.iorek.designpatterns.Messenger.Point;
import com.iorek.designpatterns.Messenger.SpaceCaculate;
import com.iorek.designpatterns.Messenger.Vector;
import com.iorek.designpatterns.ObjectDecoupling.Proxy.ProxyImplKlas;
import com.iorek.designpatterns.ObjectDecoupling.Proxy.ProxyImplKlasTwo;
import com.iorek.designpatterns.ObjectDecoupling.Proxy.ProxyKlas;
import com.iorek.designpatterns.ObjectQuantity.Singleton.GodObserver;
import com.iorek.designpatterns.ObjectQuantity.Singleton.ObserverInterface;
import com.iorek.designpatterns.ObjectQuantity.Singleton.PersonObserver;
import com.iorek.designpatterns.ObjectQuantity.Singleton.RegistryService;
import com.iorek.designpatterns.ObjectQuantity.Singleton.Singleton;
import com.iorek.designpatterns.ObjectQuantity.Singleton.SingletonLazy;
import com.iorek.designpatterns.Util.Logger;
import com.iorek.designpatterns.V2.factory.methodfactory.ClientMethodFactory;
import com.iorek.designpatterns.V2.prototype.Client;
import com.iorek.designpatterns.behavior.Command.CommandCaller;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.iorek.designpatterns", appContext.getPackageName());
    }

    @Test
    public void testSpaceCaculate()
    {
        Point point = new Point(1,1,1);
        Vector vector = new Vector(1,2);
        Point pointVector = SpaceCaculate.Caculate(point,vector);
        //Point point1 = new Point(2,2,2);
        Point point1 = pointVector;
        Logger.I(pointVector.toString());
        //assertEquals(point1.getX(),pointVector.getX());
        //assertEquals(point1,pointVector);
        //assertNotEquals(point1,pointVector);
    }

    @Test
    public void testCollector()
    {
        Filler filler = new Filler();
        Collector collector = new Collector();
        Logger.I("before collector size:"+collector.size());
        filler.fillOne(collector);
        filler.fillTwo(collector);
        filler.fillThree(collector);
        filler.fillFour(collector);

        Logger.I("end collector size:"+collector.size());

        Logger.I("end collector size ++++++++++:"+System.currentTimeMillis());

        assertEquals(collector.size(),4);
    }

    @Test
    public void testSingleton()
    {
        Singleton singleton = Singleton.GetInstance();
        singleton.setArgAge(10);
        singleton.setArgName("xupeng");
        singleton.toString();

        //assertEquals(singleton.getArgName(),"xupeng");
        //assertEquals(singleton.getArgAge(),10);

        //Singleton singleton1 = Singleton.GetInstance();
        //同一个类多次调用获取reference得到的对象时相同的
        //assertEquals(singleton,singleton1);
        //assertNotEquals(singleton,singleton1);

        SingletonLazy singletonLazy = SingletonLazy.GetInstance();
    }

    @Test
    public void tesetResiterLookup()
    {
        String name1 = "observerPerson";
        String name2 = "observerGod";
        ObserverInterface observerInterface = new PersonObserver();
        ObserverInterface observerInterface1 = new GodObserver();
        RegistryService registryService = RegistryService.GetInstance();
        registryService.RegisterObserver(observerInterface,name1);
        registryService.RegisterObserver(observerInterface1,name2);

        registryService.LookupObserver(name1).TellYourName();
        registryService.LookupObserver(name2).TellYourName();
    }

    /**
     * 测试代理模式
     */
    @Test
    public void testProxyModel()
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

        assertNotEquals(proxyKlasInstanceOne,proxyKlasInstanceTwo);

    }

    /**
     * 测试command模式创建
     */
    @Test
    public void CommandCall(){
        CommandCaller commandCaller = new CommandCaller();
        commandCaller.orderFood();
    }


    //v2--------------------
    @Test
    public void v2_methodFactory(){
        ClientMethodFactory client = new ClientMethodFactory();
        client.createProductA();
        client.createProductB();
    }

    @Test
    public void v2_testPrototype(){
        Client client = new Client();
        client.testPrototype();
    }
}
