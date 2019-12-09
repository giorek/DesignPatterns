package com.iorek.designpatterns.V2.factory.simplefactory;

/**
 * 采用单例模式创建工厂
 * 工厂通过方法参数选择需要创建的对象
 */
public class SimpleFactory {
    private static SimpleFactory instance = new SimpleFactory();
    private SimpleFactory(){}

    public static SimpleFactory getInstance(){
        return instance;
    }

    /**
     * 统一方法通过传递参数决定当前需要创建的商品实例
     * @param type
     * @return
     */
    public Product getProduct(ProductType type){
        Product product = null;
        switch (type){
            case one:
                product = new ProductOne();
                break;
            case two:
                product = new ProductTwo();
                break;
                default:
                    break;
        }
        return  product;
    }


    enum ProductType {
        one,
        two
    }
}
