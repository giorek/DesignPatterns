package com.iorek.designpatterns.v3.facade;

/**
 * 装饰模式的主要功能
 * 1、对已经存在的类接口进行重新改写
 * 2、对外封装类内部实现，实际的实现类仍然时具体类
 */
public class FacadeClaz  implements IFacade{
    private BaseClaz claz;

    /**
     * 方法一：构造的时候传递实际的类
     * @param base
     */
    public FacadeClaz(BaseClaz base){
        claz = base;
        initNativeObj();
    }

    /**
     * 可以内部而非外部构造实际操作对象
     */
    private void initNativeObj(){
        claz = new BaseClaz();
    }

    @Override
    public void init() {
        claz.method_init();
    }

    @Override
    public void create() {
        claz.method_create();
    }

    @Override
    public void destory() {
        claz.method_destory();
    }
}
