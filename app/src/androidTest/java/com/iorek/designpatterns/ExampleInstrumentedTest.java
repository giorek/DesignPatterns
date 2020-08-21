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
import com.iorek.designpatterns.V2.adapter.ClientAdapter;
import com.iorek.designpatterns.V2.bridge.AbstractPen;
import com.iorek.designpatterns.V2.bridge.GreenColor;
import com.iorek.designpatterns.V2.bridge.PenA;
import com.iorek.designpatterns.V2.bridge.PenB;
import com.iorek.designpatterns.V2.bridge.RedColor;
import com.iorek.designpatterns.V2.composite.Component;
import com.iorek.designpatterns.V2.composite.Composite;
import com.iorek.designpatterns.V2.composite.Leaf;
import com.iorek.designpatterns.V2.decorate.ComponentImpl;
import com.iorek.designpatterns.V2.decorate.Decorate;
import com.iorek.designpatterns.V2.decorate.DecorateChild1;
import com.iorek.designpatterns.V2.decorate.DecorateChild2;
import com.iorek.designpatterns.V2.factory.methodfactory.ClientMethodFactory;
import com.iorek.designpatterns.V2.flyweight.AbstractFlyweight;
import com.iorek.designpatterns.V2.flyweight.FlyWeightFactory;
import com.iorek.designpatterns.V2.prototype.Client;
import com.iorek.designpatterns.V2.proxy.RealSubject1;
import com.iorek.designpatterns.V2.proxy.SubjectInterface;
import com.iorek.designpatterns.V2.proxy.SubjectProxy;
import com.iorek.designpatterns.V2.strategy.AddConcreteStrategy;
import com.iorek.designpatterns.V2.strategy.DivStrategy;
import com.iorek.designpatterns.V2.strategy.MulStrategy;
import com.iorek.designpatterns.V2.strategy.StrategyContext;
import com.iorek.designpatterns.V2.strategy.SubtractionStrategy;
import com.iorek.designpatterns.V2.template.GameA;
import com.iorek.designpatterns.V2.template.GameB;
import com.iorek.designpatterns.V2.template.GameTemplate;
import com.iorek.designpatterns.V2.visitor.VisitorClient;
import com.iorek.designpatterns.behavior.Command.CommandCaller;
import com.iorek.designpatterns.v3.factory.absfactroy.AbsFac1;
import com.iorek.designpatterns.v3.factory.absfactroy.AbsFac2;
import com.iorek.designpatterns.v3.factory.absfactroy.Envirment;
import com.iorek.designpatterns.v3.factory.dynamic.DyCircle;
import com.iorek.designpatterns.v3.factory.dynamic.DyFactory;
import com.iorek.designpatterns.v3.factory.dynamic.DyShape;
import com.iorek.designpatterns.v3.factory.simple.Circle;
import com.iorek.designpatterns.v3.factory.simple.Shape;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Iterator;

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
        // StrategyContext of the app under test.
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

    @Test
    public void v2_testAdapter(){
        ClientAdapter clientAdapter = new ClientAdapter();
        clientAdapter.testAdapter();
    }

    @Test
    public void v2_testBridge()
    {
        AbstractPen penA = new PenA();
        penA.setmColor(new GreenColor());
        penA.draw();

        AbstractPen penB = new PenB();
        penB.setmColor(new RedColor());
        penB.draw();
    }

    @Test
    public void v2_testComposite(){
        Component componenta = new Composite("容器");
        componenta.add(new Leaf("叶子"));
        componenta.display();
    }

    @Test
    public void v2_testDecorate(){
        Decorate child1 = new DecorateChild1(new ComponentImpl());
        Decorate child2 = new DecorateChild2(new ComponentImpl());
        child1.componentMethod();
        child2.componentMethod();

    }

    @Test
    public void v2_testFlyWeight(){
        FlyWeightFactory factory = new FlyWeightFactory();
        AbstractFlyweight flyweight = factory.factory("中文");
        flyweight.flyWeightCall();

        Logger.I("------黄金分割线----------");
        factory.factory("中文").flyWeightCall();

    }

    @Test
    public void v2_testProxy(){
        SubjectProxy proxy = new SubjectProxy();
        proxy.subjectMethod1();
        proxy.subjectMethod2();

        SubjectInterface subject1 = new RealSubject1("实例1");
        SubjectInterface subject2 = new RealSubject1("实例2");

        proxy.setProxyObj(subject1);
        proxy.subjectMethod1();
        proxy.subjectMethod2();

        proxy.setProxyObj(subject2);
        proxy.subjectMethod1();
        proxy.subjectMethod2();
    }

    @Test
    public void v2_testVisitor(){
        VisitorClient client = new VisitorClient();
        client.test();
    }

    @Test
    public void v2_testStrategy(){
        AddConcreteStrategy  addConcreteStrategy = new AddConcreteStrategy();
        SubtractionStrategy  subConcreteStrategy = new SubtractionStrategy();
        MulStrategy mulStrategy = new MulStrategy();
        DivStrategy divStrategy = new DivStrategy();

        StrategyContext add = new StrategyContext(addConcreteStrategy);
        StrategyContext sub = new StrategyContext(subConcreteStrategy);
        StrategyContext mul = new StrategyContext(mulStrategy);
        StrategyContext div = new StrategyContext(divStrategy);

        float value = 0;
        float num1 = 10;
        float num2 = 20;

        value = add.doOperation(num1,num2);
        Logger.I(String.format(" add %f + %f = %f",num1,num2,value));
        value = sub.doOperation(num1,num2);
        Logger.I(String.format(" sub %f + %f = %f",num1,num2,value));
        value = mul.doOperation(num1,num2);
        Logger.I(String.format(" mul %f + %f = %f",num1,num2,value));
        value = div.doOperation(num1,num2);
        Logger.I(String.format(" div %f + %f = %f",num1,num2,value));
    }

    @Test
    public void v2_testTemplate(){
        GameTemplate gameA = new GameA();
        GameTemplate gameB = new GameB();
        gameA.palyGame();
        gameB.palyGame();
    }





    ///........................v3
    @Test
    public void v3_testSimpleFactory(){
        Shape s1 = Shape.factory("A");
        s1.draw();
        s1.erase();

        Shape s2 = Shape.factory("B");
        s2.draw();
        s2.erase();
    }

    @Test
    public void v3_testDynamicFactory(){
        DyFactory.createFactory("A");
        DyFactory.createFactory("B");
        DyFactory.createFactory("B");
        DyFactory.createFactory("A");

        Iterator<String> iterator = DyFactory.mmap.keySet().iterator();
        while (iterator.hasNext()){
            //DyFactory factory =  DyFactory.mmap.get(iterator.next());
            DyShape shape =DyFactory.createFactory(iterator.next());
            shape.draw();
            shape.erase();
        }
    }

    @Test
    public void v3_testAbsFac(){
        Envirment envirment1 = new Envirment(new AbsFac1());
        Envirment envirment2 = new Envirment(new AbsFac2());
        envirment1.play();
        envirment2.play();

    }

}
